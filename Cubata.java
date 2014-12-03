
/**
 * clase que simula una copa
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Cubata
{
    //nombre de la copa
    private String nombreCopa;
    //porcentaje de alcohol de la copa
    private int    porAlcohol;
    
    /**
     * Constructor que crea una copa con nombre y porcentaje de alcohol pasados por parametros
     */
    public Cubata(String nombreCopa, int porAlcohol )
    {
        this.nombreCopa = nombreCopa;
        this.porAlcohol = porAlcohol;
    }
    
     /**
      *retorna el porcentaje de alcohol de la copa 
      */
    public int getPorAlcohol()
    {
     return porAlcohol;
    }
}
