/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_05_E01;

/**
 *
 * @author GIGABYTE
 */
public class Hija1_05_E01 extends Persona_05_E01{

    public Hija1_05_E01(int Orden, int talla, String cabello, String nombre, int edad) {
        super(nombre, edad);
        this.Orden = Orden;
        this.talla = talla;
        this.cabello = cabello;
    }
    
    //atributos 
    int Orden;
    int talla;
    String cabello;
    
    //metodos
    public void accion(){
    
    }
    public void carrera(){
    
    }

    public int getOrden() {
        return Orden;
    }

    public void setOrden(int Orden) {
        this.Orden = Orden;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getCabello() {
        return cabello;
    }

    public void setCabello(String cabello) {
        this.cabello = cabello;
    }
    
}

