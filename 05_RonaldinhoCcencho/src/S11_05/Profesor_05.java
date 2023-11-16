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
public class Profesor_05 extends Persona_05{

    public Profesor_05(String nombre, int edad) {
        super(nombre, edad);
    }
  //Atributos 
    int celular;
    String Curso;
    int Experiencia;
    
    //metodos 
    public void Curso (){
        System.out.println("Enseña el curso de matematicas");
    }
    public void seccion (){
        System.out.println("Enseña en la seccion C");
    }
    public void experiencia(){
        System.out.println("Tiene más de 60 años de experiencia ");
    }
}
