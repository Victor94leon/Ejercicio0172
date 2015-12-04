public class Bebedor
{
    // Almacena el nombre de la persona
    private String nombre;
    // Almacena el nivel de alcohol en sangre
    private float nivelDeAlcoholEnSangre;
    // Almacena el límite de alcohol
    private float limiteDeAlcohol;
    
    /**
     * Método constructor con parametros para el nombre y el peso en kg de la persona
     */
    public Bebedor(float liimteDeAlcohol, String nombre)
    {
        this.nombre = nombre;
        this.limiteDeAlcohol = limiteDeAlcohol;
        nivelDeAlcoholEnSangre = 0;
    }

    /**
     * Método para crear un objeto de la clase copa
     */
    public void tomarCubata(Cubata copa)
    {
        if (nivelDeAlcoholEnSangre < limiteDeAlcohol) {
            nivelDeAlcoholEnSangre = nivelDeAlcoholEnSangre + copa.getCantidad();
        }
        else {
            System.out.println("No quiero beber más alcohol");
        }
    }

    /**
     * Método que devuelve el nivel de alcohol en sangre
     */
    public float getAlcoholEnSangre()
    {
        return nivelDeAlcoholEnSangre;
    }
    
    /**
     * Método para preguntarle cosas a la persona
     */
    public void preguntar(String pregunta)
    {
        //Se comprueba el nivel de alcohol o si en la pregunta esta el nombre de la persona
        if ((pregunta.contains(nombre)) || (nivelDeAlcoholEnSangre > limiteDeAlcohol)) {
            // Se transforman las letras del String a mayúsculas
            System.out.println("¡¡" + pregunta.toUpperCase() + "!!");
        }
        else {
            // Se calcula el nº de caracteres del String
            if ((pregunta.length() % 2) == 0) {
                System.out.println("Si");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
