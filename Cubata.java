
/**
 * clase que simula una copa
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Cubata
{
    private String nombreCopa;
    private float porAlcohol;
    
    /**
     * Constructor que crea una copa con nombre y porcentaje de alcohol pasados por parametros
     */
    public Cubata(String nombreCopa, float porAlcohol )
    {
        this.nombreCopa = nombreCopa;
        this.porAlcohol = porAlcohol;
    }
    
    public float getPorAlcohol()
    {
     return porAlcohol;
    }
}
