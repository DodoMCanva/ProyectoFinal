package utilerias;

/**
 * Clase que representa un elemento de un combo (por ejemplo, un elemento en una lista desplegable).
 * 
 * @author Equipo2
 */
public class ComboItems {
    
    private String nombre; // El nombre del elemento del combo
    private String id; // El identificador único del elemento del combo
    
    /**
     * Constructor que inicializa un nuevo elemento del combo con un ID y un nombre.
     * 
     * @param id El identificador único del elemento
     * @param nombre El nombre del elemento
     */
    public ComboItems(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    /**
     * Constructor que inicializa un nuevo elemento del combo solo con un ID.
     * 
     * @param id El identificador único del elemento
     */
    public ComboItems(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del elemento del combo.
     * 
     * @return El nombre del elemento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del elemento del combo.
     * 
     * @param aNombre El nuevo nombre del elemento
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Obtiene el identificador único del elemento del combo.
     * 
     * @return El identificador único del elemento
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único del elemento del combo.
     * 
     * @param aId El nuevo identificador único del elemento
     */
    public void setId(String aId) {
        id = aId;
    }
    
    /**
     * Devuelve el nombre del elemento del combo como su representación en cadena.
     * 
     * @return El nombre del elemento
     */
    @Override
    public String toString() {
        return this.nombre;
    }
    
    /**
     * Compara este elemento del combo con otro objeto para determinar la igualdad.
     * La comparación se basa en el identificador único del elemento.
     * 
     * @param item El objeto a comparar
     * @return true si los identificadores son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object item) {
        return  this.id.equals(((ComboItems) item).id);
    }
}
