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
public class policia extends Persona {

    public policia(int celular, String ropa, int peso, String nombre, int edad) {
        super(nombre, edad);
        this.celular = celular;
        this.ropa = ropa;
        this.peso = peso;
    }
    //atributos 
    int celular;
    String ropa;
    int peso;
    
    //metodos
    public void ejercicio(){
    
    }
    public void cargo(){
        
    }
}
