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

    public Estudiante_05(String carrera, int numeroDeOrden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroDeOrden = numeroDeOrden;
        this.ciclo = ciclo;
    }
    
    
    //atributos 
    String carrera ;
    int numeroDeOrden;
    int ciclo;
}
