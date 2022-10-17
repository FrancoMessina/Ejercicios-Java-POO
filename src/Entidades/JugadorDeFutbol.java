package Entidades;

/**
 *
 * @author franc
 */
public class JugadorDeFutbol {
    private String nombre;
    private int energia;
    private int felicidad;
    private int goles;
    private int experiencia;


    public JugadorDeFutbol(String nombre, int energia, int felicidad, int goles, int experiencia) {
        this.nombre = nombre;
        this.energia = energia;
        this.felicidad = felicidad;
        this.goles = goles;
        this.experiencia = experiencia;
    }

    public JugadorDeFutbol(String nombre, int energia, int felicidad, int goles) {
        this.nombre = nombre;
        this.energia = energia;
        this.felicidad = felicidad;
        this.goles = goles;
    }
    
   
    
    public void hacerGol(){
        if(energia >= 5) {
            if(felicidad <= 90)
                felicidad += 10;
            energia -= 5;
            goles++;
            System.out.println("Goool");
        }
    }

    @Override
    public String toString() {
        return "JugadorDeFutbol{" + "nombre=" + nombre + ", energia=" + energia + ", felicidad=" + felicidad + ", goles=" + goles + ", experiencia=" + experiencia + '}';
    }

  
    public void correr(){
        if(energia >= 10){
            energia -= 10;
            System.out.println("No me dan más las piernas");
        }
    }
    
    public void entrenarA(int exp){
        correr();
        hacerGol();
        correr();
        experiencia += exp;
    }
    
    
}
