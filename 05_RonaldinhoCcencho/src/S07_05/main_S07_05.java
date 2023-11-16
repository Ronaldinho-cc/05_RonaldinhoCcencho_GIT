/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_05;

/**
 *
 * @author GIGABYTE
 */
public class main_S07_05 {
      public static void main(String[] args) {
        // Creación de objetos de tipo Persona
    persona_05 persona1 = new persona_05("Carlos ", 15, 1.80);
    System.out.println(persona1.obtenerInformacion());
    
    persona_05 persona2 = new persona_05("Carla", 20 , 1.50);
          System.out.println(persona2.obtenerInformacion());
}
}
