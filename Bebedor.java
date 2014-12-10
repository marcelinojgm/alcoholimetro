
/**
Ssimula una persona bebedora que toma copas.
 *con un nivel de alcohol en sangre 
 *y un tope de alcohol que puede tomar
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // nombre de el bebedor
    private String nombre;
    //alcohol en sangre
    private float alcoholEnSangre;
    //alcohol en sagre que admite
    private float nivelMaximoAlcohol;

    /**
     * Constructor the objectos de clase Bebedor 
     * con un  sin nivel inicial de alcohol en sangre cero
     * pasandole por paramtros  su nombre(String) 
     * y el nivel maximo de alcohol que soporta (float)
     */
    public Bebedor(String nombre ,float nivelMaximoAlcohol)
    {
        this.nombre = nombre;
        this.alcoholEnSangre = 0F;
        this.nivelMaximoAlcohol = nivelMaximoAlcohol;

    }

    /**
     * retorna el nivel de alcohol en sangre
     */
    public float getAlcoholEnSangre()
    {
        return alcoholEnSangre;
    }

    /**
     * Debe una copa
     * e incrementa el nivel de alcohol en sangre según la copa
     */
    public void bebeCopa(Cubata nombreCopa)
    {
        //si esta por debajo del limite se toma la copa
        if (alcoholEnSangre < nivelMaximoAlcohol)
        {
            alcoholEnSangre = alcoholEnSangre + nombreCopa.getPorAlcohol();
        }

        //si su nivel de alcoholismo es igual o superior a su limite rechaza la copa
        else
        {
            System.out.println("Lo siento no puedo beber mas");

        }
    }

    /**
     * Realiza una pregunta al bebedor
     */
    public void preguntar(String pregunta)
    {
        //Si esta por encima del limite o escucha su nombre repite la frase gritando
        if((alcoholEnSangre >= nivelMaximoAlcohol) || pregunta.contains(nombre) )
        {
            System.out.println("¡¡¡¡¡¡¡¡" + pregunta.toUpperCase() + "!!!!!!!!");
        }

        //si no contesta si o no en funcion del numero de caracteres que tenga la pregunta        
        else
        {
            //caracteres pares
            if((pregunta.length())%2 == 0)
            {
                System.out.print("Si");
            }
            //caracteres impares
            else
            {
                System.out.print("No");
            }
        }
    }

    /**
     * retorna si esta borrqacho o no
     */
    public boolean borracho()
    {
        boolean borracho = false;
        if(alcoholEnSangre >= nivelMaximoAlcohol)
        {
            borracho = true;
        }
        return borracho;
    }

    /**
     * otra persona le ofrece una copa
     * se la bebe simpre este este borracho o no
     * si se la ofrece un borracho
     */

    public void ofrecerCopa(Bebedor ofertante, Cubata copa)
    {
        if (ofertante.borracho())
        {
            System.out.print("Ostias gracias!!");
            alcoholEnSangre = alcoholEnSangre + copa.getPorAlcohol();
        }
        else
        {
            bebeCopa(copa);
        }

    }
}
