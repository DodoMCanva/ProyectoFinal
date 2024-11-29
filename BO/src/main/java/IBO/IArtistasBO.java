package IBO;

import DTO.ArtistasDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 *
 * @author Equipo 2
 */
public interface IArtistasBO {

    public void insertarArtista(ArtistasDTO artista);

    String obtenerIdPorNombre(String nombreArtista);

    List<ArtistasDTO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionBO;

    List<ArtistasDTO> busquedaGeneralArtista(List<String> generosRestringidos, String busqueda) throws ExceptionBO;
}
