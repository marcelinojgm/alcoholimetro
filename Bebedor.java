
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // instance variables - replace the example below with your own
    private String nombre;
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
        if (alcoholEnSangre >= nivelMaximoAlcohol)
        {
            System.out.print("lo siento nopueedo beber mas");
        }
        else
        {
            alcoholEnSangre = alcoholEnSangre + nombreCopa.getPorAlcohol();
        }
    }
    
    /**
     * realiza una pregunta al borracho
     */
    public void preguntar(String pregunta)
    {
        if((alcoholEnSangre >= nivelMaximoAlcohol)|| pregunta.contains(nombre))
        {
            System.out.print("¡¡¡¡¡¡¡¡" + pregunta + "!!!!!!!!");
        }
        else
        {
        if((pregunta.length())%2 == 0)
            {
                System.out.print("Si");
            }
            else
            {
                System.out.print("No");
            }
        }
    }
    
    
  

}
