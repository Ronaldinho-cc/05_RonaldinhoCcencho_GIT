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
public class Hija3_05_E01 extends Persona_05_E01 {

    public Hija3_05_E01(int celular, String ropa, int peso, String nombre, int edad) {
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
    public void curso(){
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getRopa() {
        return ropa;
    }

    public void setRopa(String ropa) {
        this.ropa = ropa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
