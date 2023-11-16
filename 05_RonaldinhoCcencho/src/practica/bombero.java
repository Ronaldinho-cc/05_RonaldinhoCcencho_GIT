/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author GIGABYTE
 */
public class bombero extends Persona{

    public bombero(int Orden, int talla, String cabello, String nombre, int edad) {
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
    //sobrecarga de metodos
    public void horario(String semana){
    }
    public void carrera(int año){
    
    }
 
}