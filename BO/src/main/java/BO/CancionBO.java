package BO;

import DAO.CancionDAO;
import DTO.CancionDTO;
import Exceptions.ExceptionBO;
import Exceptions.ExceptionDAO;
import IBO.ICancionBO;
import IDAO.ICancionDAO;
import POJO.CancionPOJO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 * Clase que maneja la lógica de negocio para las canciones.
 * Implementa la interfaz ICancionBO.
 * 
 * @author equipo 2
 */
public class CancionBO implements ICancionBO {

    private ICancionDAO cancionDAO = new CancionDAO();

    /**
     * Constructor por defecto.
     */
    public CancionBO() {
    }

    /**
     * Inserta una nueva canción.
     * 
     * @param cancion La canción a insertar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public void insertarCancion(CancionDTO cancion) throws ExceptionBO {
        try {
            cancionDAO.insertarCancion(convertirDTOaPOJO(cancion));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(CancionBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene el ID de una canción por su nombre.
     * 
     * @param nombreCancion El nombre de la canción
     * @return El ID de la canción
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public String obtenerIdPorNombre(String nombreCancion) throws ExceptionBO {
        return cancionDAO.obtenerIdPorNombre(nombreCancion);
    }

    /**
     * Convierte una canción de DTO a POJO.
     * 
     * @param dto El DTO de la canción
     * @return El POJO de la canción
     */
    public CancionPOJO convertirDTOaPOJO(CancionDTO dto) {
        CancionPOJO POJO;
        POJO = new CancionPOJO(
                dto.getNombre(),
                dto.getDuracion(),
                dto.getGenero()
        );
        return POJO;
    }

    /**
     * Consulta general de canciones restringida por géneros.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @return Lista de canciones que no están en los géneros restringidos
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public List<CancionDTO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionBO {
        try {
            List<CancionPOJO> pojoList = cancionDAO.consultaGeneralCancion(generosRestringidos);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error al consultar las canciones en la capa BO", ex);
        }
    }

    /**
     * Búsqueda general de canciones con criterios de género y búsqueda.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @param busqueda Texto de búsqueda
     * @return Lista de canciones que coinciden con los criterios
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public List<CancionDTO> busquedaGeneralCancion(List<String> generosRestringidos, String busqueda) throws ExceptionBO {
        try {
            List<CancionPOJO> pojoList = cancionDAO.busquedaGeneralCancion(generosRestringidos, busqueda);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error en la búsqueda de canciones en la capa BO", ex);
        }
    }

    /**
     * Convierte una canción de POJO a DTO.
     * 
     * @param pojo El POJO de la canción
     * @return El DTO de la canción
     */
    private CancionDTO convertirCancionPOJOaDTO(CancionPOJO pojo) {
        return new CancionDTO(
                pojo.getId().toHexString(),
                pojo.getNombre(),
                pojo.getDuracion(),
                pojo.getGenero()
        );
    }

    /**
     * Convierte una lista de canciones de POJO a DTO.
     * 
     * @param pojoList La lista de POJOs de las canciones
     * @return La lista de DTOs de las canciones
     */
    private List<CancionDTO> convertirListaDePOJOaDTO(List<CancionPOJO> pojoList) {
        List<CancionDTO> dtoList = new ArrayList<>();
        for (CancionPOJO pojo : pojoList) {
            dtoList.add(convertirCancionPOJOaDTO(pojo));
        }
        return dtoList;
    }

    /**
     * Consulta una canción por su ID.
     * 
     * @param id El ID de la canción
     * @return El DTO de la canción
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public CancionDTO consulta(String id) throws ExceptionBO {
        try {
            ObjectId objectId;
            try {
                objectId = new ObjectId(id);
            } catch (IllegalArgumentException e) {
                throw new ExceptionBO("El ID del usuario no es válido: " + id, e);
            }
            CancionPOJO cancionPOJO = cancionDAO.consulta(objectId);
            if (cancionPOJO != null) {
                return convertirCancionPOJOaDTO(cancionPOJO);
            }
            return null;
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("Error al buscar el usuario en la capa BO", e);
        }
    }
}
