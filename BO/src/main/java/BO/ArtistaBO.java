package BO;

import DAO.ArtistaDAO;
import DTO.ArtistasDTO;
import DTO.IntegranteDTO;
import Exceptions.ExceptionBO;
import Exceptions.ExceptionDAO;
import IBO.IArtistasBO;
import IDAO.IArtistaDAO;
import POJO.ArtistaPOJO;
import POJO.IntegrantesPOJO;
import POJO.UsuarioPOJO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public class ArtistaBO implements IArtistasBO {

    private final IArtistaDAO artistasDAO = new ArtistaDAO();

    public ArtistaBO() {

    }

    @Override
    public void insertarArtista(ArtistasDTO artista) {
        try {
            artistasDAO.insertarArtistas(covertirArtistadeDTOaPOJO(artista));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(ArtistaBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String obtenerIdPorNombre(String nombreArtista) {
        return artistasDAO.obtenerIdPorNombre(nombreArtista);
    }

    public ArtistaPOJO covertirArtistadeDTOaPOJO(ArtistasDTO DTO) {
        ArtistaPOJO POJO;
        if (DTO.getIntegrantes() != null) {
            POJO = new ArtistaPOJO(
                    DTO.getNombre(),
                    DTO.getImagen(),
                    DTO.getTipo(),
                    DTO.getGenero(),
                    convertirIntegrantesDTOaPOJO(DTO));
        } else {
            POJO = new ArtistaPOJO(
                    DTO.getNombre(),
                    DTO.getImagen(),
                    DTO.getTipo(),
                    DTO.getGenero(),
                    null);
        }

        return POJO;
    }

       @Override
    public List<ArtistasDTO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionBO {
        try {
            List<ArtistaPOJO> pojoList = artistasDAO.consultaGeneralArtista(generosRestringidos);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error al consultar los artistas en la capa BO", ex);
        }
    }

    @Override
    public List<ArtistasDTO> busquedaGeneralArtista(List<String> generosRestringidos, String busqueda) throws ExceptionBO {
        try {
            List<ArtistaPOJO> pojoList = artistasDAO.busquedaGeneralArtista(generosRestringidos, busqueda);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error en la búsqueda de artistas en la capa BO", ex);
        }
    }

   

    private ArtistasDTO convertirArtistaPOJOaDTO(ArtistaPOJO pojo) {
        List<IntegranteDTO> integrantesDTO = new ArrayList<>();
        if (pojo.getIntegrantes() != null) {
            for (IntegrantesPOJO integrante : pojo.getIntegrantes()) {
                integrantesDTO.add(new IntegranteDTO(
                        integrante.getNombre(),
                        integrante.getRol(),
                        integrante.getImagen(),
                        integrante.getIngreso(),
                        integrante.getSalida(),
                        integrante.isEstado()
                ));
            }
        }
        return new ArtistasDTO(
                pojo.getId().toHexString(),
                pojo.getNombre(),
                pojo.getImagen(),
                pojo.getTipo(),
                pojo.getGenero(),
                integrantesDTO
        );
    }

    private List<ArtistasDTO> convertirListaDePOJOaDTO(List<ArtistaPOJO> pojoList) {
        List<ArtistasDTO> dtoList = new ArrayList<>();
        for (ArtistaPOJO pojo : pojoList) {
            dtoList.add(convertirArtistaPOJOaDTO(pojo));
        }
        return dtoList;
    }


    public List<IntegrantesPOJO> convertirIntegrantesDTOaPOJO(ArtistasDTO artDTO) {
        List<IntegrantesPOJO> listaPOJO = new ArrayList<>();

        for (IntegranteDTO integranteDTO : artDTO.getIntegrantes()) {
            IntegrantesPOJO integrantePOJO = new IntegrantesPOJO();
            integrantePOJO.setNombre(integranteDTO.getNombre());
            integrantePOJO.setImagen(integranteDTO.getImagen());
            integrantePOJO.setRol(integranteDTO.getRol());
            integrantePOJO.setIngreso(integranteDTO.getIngreso());
            integrantePOJO.setSalida(integranteDTO.getSalida());
            integrantePOJO.setEstado(integranteDTO.isEstado());

            listaPOJO.add(integrantePOJO);
        }
        return listaPOJO;
    }

    @Override
    public ArtistasDTO consulta(String id) throws ExceptionBO {
        try {
            ObjectId objectId;
            try {
                objectId = new ObjectId(id);
            } catch (IllegalArgumentException e) {
                throw new ExceptionBO("El ID del usuario no es válido: " + id, e);
            }
            ArtistaPOJO artistaPOJO = artistasDAO.consulta(objectId);
            if (artistaPOJO != null) {
                return convertirArtistaPOJOaDTO(artistaPOJO);
            }
            return null;
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("Error al buscar el usuario en la capa BO", e);
        }}

}
