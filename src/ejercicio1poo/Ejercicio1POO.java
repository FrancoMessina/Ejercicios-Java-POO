/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;


import Entidades.Idiomas.Persona;
import java.util.ArrayList;
import Entidades.JugadorDeFutbol;
import Entidades.Semaforos.Semaforo;
/**
 *
 * @author franc
 */
public class Ejercicio1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio1
        JugadorDeFutbol jugador2 = new JugadorDeFutbol("Messi", 100, 200, 150, 0);
        JugadorDeFutbol jugador1 = new JugadorDeFutbol("Ronaldo", 100, 100, 50, 0);
        System.out.println(jugador1);
        jugador1.entrenarA(500);
        System.out.println(jugador1);
    
        //Ejercicio 2
        ArrayList<String> idiomas = new ArrayList<>();
        idiomas.add("Ingles");
        idiomas.add("Español");
        idiomas.add("Aleman");
        
        Persona persona = new Persona("Franco", "Messina", 41414141, idiomas);
        persona.Saludar("Portugues");
  
        Semaforo semaforo1  = new Semaforo("Verde");
        Semaforo semaforo2 = new Semaforo("Amarillo");
        
        semaforo2.sincronizarColor(semaforo1);
        System.out.println("Semaforo 1 " + semaforo1.getColor() + "Semaforo 2 " + semaforo2.getColor());
     
        
    }
    
}
