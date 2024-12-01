package BO;

import DAO.UsuarioDAO;
import DTO.FavoritosDTO;
import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import Exceptions.ExceptionDAO;
import IBO.IUsuarioBO;
import IDAO.IUsuarioDAO;
import POJO.FavoritosPOJO;
import POJO.UsuarioPOJO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author equipo 2
 */
public class UsuarioBO implements IUsuarioBO {

    private final IUsuarioDAO usuarioDAO = new UsuarioDAO();

    public UsuarioBO() {
    }

    @Override
    public void guardarUsuario(UsuarioDTO usuarioDTO) throws ExceptionBO {
        try {
            String hashedPassword = BCrypt.hashpw(usuarioDTO.getPassword(), BCrypt.gensalt());
            UsuarioPOJO usuarioPOJO = new UsuarioPOJO(usuarioDTO.getNombre(), usuarioDTO.getEmail(), hashedPassword, usuarioDTO.getImagen(), usuarioDTO.getRestringidosGeneros());
            usuarioDAO.guardarUsuario(usuarioPOJO);
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("no se mando la informacion a persistencia", e);
        }
    }

    @Override
    public boolean iniciarSesion(String nombre, String password) throws ExceptionBO {
        try {
            UsuarioPOJO usuarioPOJO = usuarioDAO.buscarPorNombre(nombre);
            if (usuarioPOJO == null || usuarioPOJO.getPassword() == null) {
                System.out.println("Usuario no encontrado o hash no válido");
                return false;
            }

            boolean contraseñaValida = BCrypt.checkpw(password, usuarioPOJO.getPassword());
            if (contraseñaValida) {
                System.out.println("Inicio de sesión exitoso");
            } else {
                System.out.println("Contraseña incorrecta");
            }

            return contraseñaValida;
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("Error al iniciar sesion, fallo la busqueda del usuario", e);
        }
    }

    @Override
    public void editarUsuario(UsuarioDTO usuario) throws ExceptionBO {
        try {

            UsuarioPOJO usuarioPOJO = convertirUsuarioDTOaPOJO(usuario);
            usuarioPOJO.setPassword(BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt()));
            usuarioDAO.editarUsuario(usuarioPOJO);
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("Error al editar el usuario en la capa BO", e);
        }
    }

    @Override
    public void restringirGenero(String sesion, String genero) throws ExceptionBO {
        try {
            usuarioDAO.restringirGenero(sesion, genero);
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void regresaGenero(String sesion, String genero) throws ExceptionBO {
        try {
            usuarioDAO.regresaGenero(sesion, genero);
        } catch (ExceptionDAO e) {
        }
    }

    @Override
    public List<String> consultaRestringidos(String sesion) throws ExceptionBO {
        try {
            List<String> lista = usuarioDAO.consultaRestringidos(sesion);
            usuarioDAO.consultaRestringidos(sesion).add("Default");
            return lista;
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void agregarArtistaFavorito(String sesion, String artista) throws ExceptionBO {
        try {
            usuarioDAO.agregarCancionFavorito(convertirUsuarioDTOaPOJO(buscar(sesion)), new ObjectId(artista));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean eliminarFavoritoArtista(String sesion, String artista) throws ExceptionBO {
        try {
            return usuarioDAO.eliminarFavoritoCancion(convertirUsuarioDTOaPOJO(buscar(sesion)), new ObjectId(artista));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void agregarCancionFavorito(String sesion, String cancion) throws ExceptionBO {
        try {
            usuarioDAO.agregarCancionFavorito(convertirUsuarioDTOaPOJO(buscar(sesion)), new ObjectId(cancion));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean eliminarFavoritoCancion(String sesion, String cancion) throws ExceptionBO {
        try {
            return usuarioDAO.eliminarFavoritoCancion(convertirUsuarioDTOaPOJO(buscar(sesion)), new ObjectId(cancion));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void agregarAlbumFavorito(String sesion, String album) throws ExceptionBO {
        try {
            usuarioDAO.agregarAlbumFavorito(convertirUsuarioDTOaPOJO(buscar(sesion)), new ObjectId(album));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarFavoritoAlbum(String sesion, String album) throws ExceptionBO {
        try {
            usuarioDAO.eliminarFavoritoCancion(convertirUsuarioDTOaPOJO(buscar(sesion)), new ObjectId(album));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public UsuarioDTO buscarPorNombre(String nombre) throws ExceptionBO {
        try {
            UsuarioPOJO pojo = usuarioDAO.buscarPorNombre(nombre);
            if (pojo != null) {
                return convertirUsuarioPOJOaDTO(pojo);
            }
            return null;
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error al buscar el usuario por nombre en la capa BO", ex);
        }
    }

    private UsuarioPOJO convertirUsuarioDTOaPOJO(UsuarioDTO dto) throws IllegalArgumentException {
        List<ObjectId> artistas = new ArrayList<>();
        if (dto.getFavoritos() != null && dto.getFavoritos().getArtistas() != null) {
            for (String id : dto.getFavoritos().getArtistas()) {
                if (ObjectId.isValid(id)) {
                    artistas.add(new ObjectId(id));
                }
            }
        }

        List<ObjectId> albums = new ArrayList<>();
        if (dto.getFavoritos() != null && dto.getFavoritos().getAlbums() != null) {
            for (String id : dto.getFavoritos().getAlbums()) {
                if (ObjectId.isValid(id)) {
                    albums.add(new ObjectId(id));
                }
            }
        }

        List<ObjectId> canciones = new ArrayList<>();
        if (dto.getFavoritos() != null && dto.getFavoritos().getCanciones() != null) {
            for (String id : dto.getFavoritos().getCanciones()) {
                if (ObjectId.isValid(id)) {
                    canciones.add(new ObjectId(id));
                }
            }
        }

        FavoritosPOJO favoritosPOJO = new FavoritosPOJO(artistas, albums, canciones);

        if (!ObjectId.isValid(dto.getId())) {
            throw new IllegalArgumentException("El ID del usuario no es válido: " + dto.getId());
        }

        // Devolver el UsuarioPOJO
        return new UsuarioPOJO(
                new ObjectId(dto.getId()), // Conversión de String a ObjectId
                dto.getNombre(),
                dto.getEmail(),
                dto.getPassword(),
                dto.getImagen(),
                dto.getRestringidosGeneros(),
                favoritosPOJO // Asignar el objeto favoritos convertido
        );
    }

    private UsuarioDTO convertirUsuarioPOJOaDTO(UsuarioPOJO pojo) {

        List<String> artistas = new ArrayList<>();
        if (pojo.getFavoritos() != null && pojo.getFavoritos().getArtistas() != null) {
            for (ObjectId id : pojo.getFavoritos().getArtistas()) {
                artistas.add(id.toHexString());
            }
        }

        List<String> albums = new ArrayList<>();
        if (pojo.getFavoritos() != null && pojo.getFavoritos().getAlbums() != null) {
            for (ObjectId id : pojo.getFavoritos().getAlbums()) {
                albums.add(id.toHexString());
            }
        }

        List<String> canciones = new ArrayList<>();
        if (pojo.getFavoritos() != null && pojo.getFavoritos().getCanciones() != null) {
            for (ObjectId id : pojo.getFavoritos().getCanciones()) {
                canciones.add(id.toHexString());
            }
        }

        // Crear el objeto FavoritosDTO
        FavoritosDTO favoritosDTO = new FavoritosDTO(artistas, albums, canciones);

        // Devolver el UsuarioDTO
        return new UsuarioDTO(
                pojo.getId().toHexString(),
                pojo.getNombre(),
                pojo.getEmail(),
                pojo.getPassword(),
                pojo.getImagen(),
                pojo.getRestringidosGeneros(),
                favoritosDTO
        );
    }

    @Override
    public UsuarioDTO buscar(String id) throws ExceptionBO {
        try {
            ObjectId objectId;
            try {
                objectId = new ObjectId(id);
            } catch (IllegalArgumentException e) {
                throw new ExceptionBO("El ID del usuario no es válido: " + id, e);
            }
            UsuarioPOJO usuarioPOJO = usuarioDAO.buscar(objectId);
            if (usuarioPOJO != null) {
                return convertirUsuarioPOJOaDTO(usuarioPOJO);
            }
            return null;
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("Error al buscar el usuario en la capa BO", e);
        }
    }

    @Override
    public boolean comprobarFavoritoArtista(UsuarioDTO dto, String id) throws ExceptionBO {
        if (dto == null || dto.getFavoritos() == null || dto.getFavoritos().getArtistas() == null) {
            return false;
        }

        for (String artista : dto.getFavoritos().getArtistas()) {
            if (artista.equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean comprobarFavoritoCancion(UsuarioDTO dto, String id) throws ExceptionBO {
        for (String cancion : dto.getFavoritos().getCanciones()) {
            System.out.println("canciooooooon" + cancion);
            System.out.println("idddsssss" + id);
            if (cancion.equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean comprobarFavoritoAlbum(UsuarioDTO dto, String id) throws ExceptionBO {
        if (dto == null || dto.getFavoritos() == null || dto.getFavoritos().getAlbums() == null) {
            return false;
        }

        for (String cancion : dto.getFavoritos().getAlbums()) {
            if (cancion.equals(id)) {
                return true;
            }
        }
        return false;
    }

}
