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
public class medico_05_E01 extends Persona_05_E01{

    public medico_05_E01(int numero, int nacimiento, String padre, String nombre, int edad) {
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
    public void profesion(){
    
    }
    
    public void ocupacion(){
    
    }
}