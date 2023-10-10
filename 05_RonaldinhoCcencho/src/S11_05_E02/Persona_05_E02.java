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
public class Persona_05_E02 extends serVivo {
  
    public Persona_05_E02(String nombre) {
        super(nombre);
    }
  
     @Override
    public void comer(){
        System.out.println(nombre + " come con un tenedor");
    }
}
