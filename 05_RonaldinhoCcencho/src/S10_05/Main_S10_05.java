/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10_05;
/**
 *
 * @author GIGABYTE
 */
public class Main_S10_05 {
   public static void main(String[] args) {
        
        
        futbolista_05 futbolista1 = new futbolista_05(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_05 masajista1  = new masajista_05("si", 15, 2, "raul", "Martines", 50);
        entrenador_05 RicardoGareca = new entrenador_05("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();
        
        
                
        
        
    }
    }

