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

    public class Estudiante_05 {
    private String nombre;
    private int edad;
    private String materia;
    
    // Constructor sin parámetros
    public Estudiante_05() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
    
    // Constructor con parámetros (nombre y edad)

    public Estudiante_05(String nombre, int edad, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }
  
    
    // Métodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
     public void setMateria(String materia) {
        this.materia = materia;
    }
  
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
      public String getMateria() {
        return materia;
    }

  
    
    // Sobrecarga de métodos
    public void estudiar() {
        System.out.println("El estudiante " + nombre + " esta estudiando.");
    }
    
    public void estudiar(String materia) {
        System.out.println("El estudiante " + nombre + " esta estudiando " + materia + ".");
    }
    
    // Método con valor de retorno
    public String obtenerInformacion() {
        return "El estudiante " + nombre + " de  " + edad +" años "+" esta estudiando la materia de " + materia;
    }
}

    
