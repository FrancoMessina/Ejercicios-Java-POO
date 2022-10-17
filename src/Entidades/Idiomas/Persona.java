/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Idiomas;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int DNI;
    private ArrayList<String> idiomas;

    public Persona(String nombre, String apellido, int DNI, ArrayList<String> idiomas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.idiomas = idiomas;
    }

    private String pensarRespuesta(String idioma) {
        boolean seEncontroIdioma = false;
        String mensaje = "No conozco el idioma";
        for (String auxIdioma : idiomas) {
            if (auxIdioma.equals(idioma)) // Comparo el idioma con el que estoy iterando en el for.
            {
                seEncontroIdioma = true;
                break; // Sale del for porque ya sabemos que el idioma se encuentra.
            }
        }
        if (seEncontroIdioma == true) { // Si se encontro el idioma agregamos el mensaje
            switch (idioma) {
                case "Español":
                    mensaje = "Hola como estas?";
                    break;
                case "Ingles":
                    mensaje = "Hi!!";
                    break;
                case "Aleman":
                    mensaje = "Hallo";
                    break;

            }
        }
        return mensaje;
    }
    
    public void Saludar(String idioma){
        String mensaje = pensarRespuesta(idioma);
        System.out.println(toString());
        System.out.println(mensaje);
    }
    private String mostrarIdiomas(){ // Cargo en un string todo los idiomas que sabe la persona
        String mensaje = "";
         for(String idioma : idiomas) {
             mensaje += " " + idioma;
        }
         return mensaje;
    }
    
        @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI="  + DNI + ", idiomas=" + mostrarIdiomas() + '}';
    }
}
