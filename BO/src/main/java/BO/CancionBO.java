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
                dto.getDuracion());
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
                pojo.getNombre(),
                pojo.getDuracion()
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
    public CancionDTO consulta(List<String> generosRestringidos, String id) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
