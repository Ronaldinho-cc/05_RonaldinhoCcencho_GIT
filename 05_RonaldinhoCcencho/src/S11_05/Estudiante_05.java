/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_05;

/**
 *
 * @author GIGABYTE
 */
public class Estudiante_05 extends Persona_05{

    public Estudiante_05(String nombre, int edad) {
        super(nombre, edad);
    }
    //Atributos 
    String correo;
    int grado;
    String ComidaFavorita;
    
    //metodos 
    public void comidaFavorita(){
        System.out.println("Mi comida favorita es el arroz con pollo");
    }
    public void correo(){
        System.out.println("Mi correo es ejemplo.hackerxd@gmail.com");
    }
    public void grado(){
        System.out.println("Estoy en el 6 grado de primaria ");
    }
}
