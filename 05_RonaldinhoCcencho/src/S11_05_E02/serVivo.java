/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_05_E02;

/**
 *
 * @author GIGABYTE
 */
public class serVivo  {

    public serVivo(String nombre) {
        this.nombre = nombre;
    }
    
    //atributos
    String nombre;
    //clase Padre
    
    public void comer(){
        System.out.println(nombre + " come ");
    }
}
