/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_05;

/**
 *
 * @author GIGABYTE
 */
public class Main_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Clase estudiantes objetos 
        Estudiante_05 per1 = new Estudiante_05("Juan" , 18, "Matematicas");/*Sobrecargar de constructor clase estudiante_05*/
        System.out.println(per1.obtenerInformacion());

   
        //Clase calculadora objeto 
        Calculadora_05 num = new Calculadora_05(15, 15); /*sobrecarga de constructor clase calculadora_05*/
        num.sumar();
        num.resta();
        num.multiplicar();
        num.dividir();
        num.salida();
        
    }
  
    }
    

