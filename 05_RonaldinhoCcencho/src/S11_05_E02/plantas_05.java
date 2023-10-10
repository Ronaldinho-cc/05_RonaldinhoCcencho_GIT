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
public class plantas_05 extends serVivo {

    public plantas_05(String nombre) {
        super(nombre);
    }
       @Override
    public void comer(){
        System.out.println(nombre + " no come , porque es una planta");
    }
    
    
}
