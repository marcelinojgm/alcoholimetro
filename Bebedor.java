
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // nombre de el bebedor
    private String nombre;
    //alcohol en sangre
    private int alcoholEnSangre;
    //alcohol en sagre que admite
    private int nivelMaximoAlcohol;

    /**
     * Constructor for objects of class Bebedor con nivel de alcohol en sangre cero
     * pasandole por paramtro el alcohol que puede beber y su nombre
     */
    public Bebedor(String nombre ,int nivelMaximoAlcohol)
    {
        this.nombre = nombre;
        this.alcoholEnSangre = 0;
        this.nivelMaximoAlcohol = nivelMaximoAlcohol;

    }
    
    /**
     * retorna el nivel de alcohol en sangre
     */
    public int getAlcoholEnSangre()
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
