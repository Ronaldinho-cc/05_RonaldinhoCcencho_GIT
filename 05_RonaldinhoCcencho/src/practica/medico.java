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
public class medico extends Persona{

    public medico(int numero, int nacimiento, String padre, String nombre, int edad) {
        super(nombre, edad);
        this.numero = numero;
        this.nacimiento = nacimiento;
        this.ocupacion = ocupacion;
    }

    //atributos 
    int numero;
    int nacimiento;
    String ocupacion;
    
    //metodos
    public void profesion(int año){
        System.out.println("el año es " + año);
    }
    
    public void ocupacion(){
    
    }
}