package BO;

import DAO.CancionDAO;
import DTO.CancionDTO;
import Exceptions.ExceptionBO;
import Exceptions.ExceptionDAO;
import IBO.ICancionBO;
import IDAO.ICancionDAO;
import POJO.CancionPOJO;
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
    public String obtenerIdPorNombre(String nombre) throws ExceptionBO {
        return "";
    }

    public CancionPOJO convertirDTOaPOJO(CancionDTO dto) {
        CancionPOJO POJO;
        POJO = new CancionPOJO(
                dto.getNombre(),
                dto.getDuracion());
        return POJO;

    }

}
