
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // instance variables - replace the example below with your own
    private float alcoholEnSangre;
    private int   nivelMaximoAlcohol;

    /**
     * Constructor for objects of class Bebedor con nivel de alcohol en sangre cero
     */
    public Bebedor()
    {
        this.alcoholEnSangre = 0;
        this.nivelMaximoAlcohol = 32;

    }
    
    /**
     * retorna el nivel de alcohol en sangre
     */
    public float getAlcoholEnSangre()
    {
        return alcoholEnSangre;
    }
    
    /**
     * bebe una copa
     * e incrementa el nivel de alcohol en sangre según la copa
     */
    public void bebeCopa(Cubata nombreCopa)
    {
        alcoholEnSangre = alcoholEnSangre + nombreCopa.getPorAlcohol();
    }
    
    
  

}
