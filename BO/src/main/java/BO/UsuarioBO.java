package BO;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import IBO.IUsuarioBO;
import IDAO.IUsuarioDAO;
import POJO.UsuarioPOJO;
import java.util.List;
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
        } catch (Exception e) {
            throw new ExceptionBO("no se mando la informacion a persistencia", e);
        }
    }

    @Override
    public boolean iniciarSesion(String nombre, String password) throws ExceptionBO {
        try {
            // Buscar el UsuarioPOJO por nombre o email (asegúrate de que el método sea correcto)
            UsuarioPOJO usuarioPOJO = usuarioDAO.buscarPorNombre(nombre); // O buscarPorEmail, según tu caso

            // Validar que el usuario exista y que el hash de la contraseña no sea nulo
            if (usuarioPOJO == null || usuarioPOJO.getPassword() == null) {
                System.out.println("Usuario no encontrado o hash no válido");
                return false;
            }

            // Comparar la contraseña con el hash almacenado
            boolean contraseñaValida = BCrypt.checkpw(password, usuarioPOJO.getPassword());
            if (contraseñaValida) {
                System.out.println("Inicio de sesión exitoso");
            } else {
                System.out.println("Contraseña incorrecta");
            }

            return contraseñaValida;
        } catch (Exception e) {
            throw new ExceptionBO("Error al iniciar sesion, fallo la busqueda del usuario", e);
        }
    }

    @Override
    public void editarUsuario(UsuarioDTO usuario) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void restringirGenero(String sesion, String genero) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void regresaGenero(String sesion, String genero) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> consultaRestringidos(String sesion) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarArtistaFavorito(String sesion, String artista) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFavoritoArtista(String sesion, String artista) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarCancionFavorito(String sesion, String cancion) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFavoritoCancion(String sesion, String cancion) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarAlbumFavorito(String sesion, String album) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFavoritoAlbum(String sesion, String album) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioDTO buscarPorNombre(String nombre) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioDTO buscar(String id) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean comprobarFavoritoArtista(String id) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean comprobarFavoritoCancion(String id) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean comprobarFavoritoAlbum(String id) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    

    

    

}
