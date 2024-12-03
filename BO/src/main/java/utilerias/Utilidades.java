package utilerias;


/**
 * Clase que proporciona métodos utilitarios.
 * 
 * @autor Equipo2
 */
public class Utilidades {
    
    /**
     * Calcula el valor de OFFSET para una consulta paginada en MySQL.
     * 
     * @param limite El límite de registros por página
     * @param pagina El número de página actual
     * @return El valor de OFFSET para la consulta
     */
    public int RegresarOFFSETMySQL(int limite, int pagina) {
        if (pagina <= 1)
          return 0;
        
        if (pagina == 2)
          return limite;

        return ((int)(limite * (pagina - 1)));
    }
    
}

