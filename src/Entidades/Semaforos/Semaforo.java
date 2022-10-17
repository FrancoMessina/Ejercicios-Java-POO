/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Semaforos;

/**
 *
 * @author franc
 */
public class Semaforo {
    private String color;

    public Semaforo(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void sincronizarColor(Semaforo semaforo){
        switch (this.getColor()) {                 // Opcion 1
            case "Rojo":
                semaforo.setColor("Verde");
                break;
            case "Amarillo":
                semaforo.setColor("Amarillo");
                break;
            case "Verde":
                semaforo.setColor("Rojo");
                break;
        }
        /*
        if(this.getColor().equals("Rojo")){ // Opcion 2
            semaforo.setColor("Verde");
        }else if(this.getColor().equals("Amarillo")){
            semaforo.setColor("Amarillo");
        }else if(this.getColor().equals("Verde")){
            semaforo.setColor("Rojo");
        }
        */
    }

    public void sincronizarColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
