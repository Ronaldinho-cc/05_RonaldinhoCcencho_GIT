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
public class bombero_05_E01 extends Persona_05_E01{

    public bombero_05_E01(int Orden, int talla, String cabello, String nombre, int edad) {
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
    public void horario(){
    
    }
    public void carrera(){
    
    }
}