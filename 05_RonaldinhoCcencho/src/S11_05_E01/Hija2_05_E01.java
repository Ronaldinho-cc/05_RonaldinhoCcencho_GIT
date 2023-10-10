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
public class Hija2_05_E01 extends Persona_05_E01{

    public Hija2_05_E01(int numero, int nacimiento, String padre, String nombre, int edad) {
        super(nombre, edad);
        this.numero = numero;
        this.nacimiento = nacimiento;
        this.padre = padre;
    }

    
    //atributos 
    int numero;
    int nacimiento;
    String padre;
    
    //metodos
    public void profesion(){
    
    }
    
    public void gustos(){
    
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }
    
}
