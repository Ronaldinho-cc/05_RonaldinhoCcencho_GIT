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
public class Persona_05 {

    public Persona_05(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    //atributos
    private String nombre;
    private int edad ;
    
    //get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
       //metodos
    
    public void hablar(){
        System.out.println("Estoy hablando");
    }
    public void caminar(){
        System.out.println("Estoy caminando");
    }
  
}
