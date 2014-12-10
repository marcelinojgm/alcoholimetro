
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
    private float  porAlcohol;
    
    /**
     * Constructor que crea una copa 
     * pasando por parametros
     *      -Nombre (string)
     *      -Porcentaje de alcohol.(float)
     */
    public Cubata(String nombreCopa, float porAlcohol )
    {
        this.nombreCopa = nombreCopa;
        this.porAlcohol = porAlcohol;
    }
    
     /**
      *retorna el porcentaje de alcohol de la copa 
      */
    public float getPorAlcohol()
    {
     return this.porAlcohol;
    }
}
