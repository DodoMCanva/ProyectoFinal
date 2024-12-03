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
 *
 * @author equipo 2
 */
public class CancionBO implements ICancionBO {

    private ICancionDAO cancionDAO = new CancionDAO();

    public CancionBO() {
    }

    @Override
    public void insertarCancion(CancionDTO cancion) throws ExceptionBO {
        try {
            cancionDAO.insertarCancion(convertirDTOaPOJO(cancion));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(CancionBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String obtenerIdPorNombre(String nombreCancion) throws ExceptionBO {
        return cancionDAO.obtenerIdPorNombre(nombreCancion);
    }

    public CancionPOJO convertirDTOaPOJO(CancionDTO dto) {
        CancionPOJO POJO;
        POJO = new CancionPOJO(
                dto.getNombre(),
                dto.getDuracion(),
                dto.getGenero()
        
        );
        return POJO;

    }

    @Override
    public List<CancionDTO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionBO {
        try {

            List<CancionPOJO> pojoList = cancionDAO.consultaGeneralCancion(generosRestringidos);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error al consultar las canciones en la capa BO", ex);
        }
    }

    @Override
    public List<CancionDTO> busquedaGeneralCancion(List<String> generosRestringidos, String busqueda) throws ExceptionBO {
        try {
            List<CancionPOJO> pojoList = cancionDAO.busquedaGeneralCancion(generosRestringidos, busqueda);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error en la búsqueda de canciones en la capa BO", ex);
        }
    }

    private CancionDTO convertirCancionPOJOaDTO(CancionPOJO pojo) {
        return new CancionDTO(
                pojo.getId().toHexString(),
                pojo.getNombre(),
                pojo.getDuracion(),
                pojo.getGenero()
        );
    }

    private List<CancionDTO> convertirListaDePOJOaDTO(List<CancionPOJO> pojoList) {
        List<CancionDTO> dtoList = new ArrayList<>();
        for (CancionPOJO pojo : pojoList) {
            dtoList.add(convertirCancionPOJOaDTO(pojo));
        }
        return dtoList;
    }

    @Override
    public CancionDTO consulta( String id) throws ExceptionBO {
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
        }}
}
