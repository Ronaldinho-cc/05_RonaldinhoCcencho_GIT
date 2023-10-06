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
public class masajista_05 extends seleccionFutbol_05{


    public masajista_05(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

//atributos
    private String titulacion;
    private int aniosExperiencia;

   
//metodos

    public void darMasaje() {
        System.out.println(nombre + " da masajes");
    }
 
}
