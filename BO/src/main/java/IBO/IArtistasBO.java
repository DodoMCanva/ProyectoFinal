package IBO;

import DTO.ArtistasDTO;

/**
 *
 * @author Equipo 2
 */
public interface IArtistasBO {

    public void insertarArtista(ArtistasDTO artista);

    String obtenerIdPorNombre(String nombreArtista);
}
