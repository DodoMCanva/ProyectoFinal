package BO;

import DAO.ArtistaDAO;
import DTO.ArtistasDTO;
import DTO.IntegranteDTO;
import Exceptions.ExceptionDAO;
import IBO.IArtistasBO;
import IDAO.IArtistaDAO;
import POJO.ArtistaPOJO;
import POJO.IntegrantesPOJO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar
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

    public List<IntegrantesPOJO> convertirIntegrantesDTOaPOJO(ArtistasDTO artDTO) {
        List<IntegrantesPOJO> listaPOJO = new ArrayList<>();

        for (IntegranteDTO integranteDTO : artDTO.getIntegrantes()) {
            IntegrantesPOJO integrantePOJO = new IntegrantesPOJO();
            integrantePOJO.setNombre(integranteDTO.getNombre());
            integrantePOJO.setRol(integranteDTO.getRol());
            integrantePOJO.setIngreso(integranteDTO.getIngreso());
            integrantePOJO.setSalida(integranteDTO.getSalida());
            integrantePOJO.setEstado(integranteDTO.isEstado());

            listaPOJO.add(integrantePOJO);
        }
        return listaPOJO;
    }

}
