/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author GIGABYTE
 */
public class Main {
       
    public static void main(String[] args){
       bombero obj1 = new bombero(1, 150, "corto", "marcela",12);
       obj1.caminar();
       
       medico obj2 = new medico(2, 20, "jose", "mariela",20);
       obj1.caminar();
       
       policia obj3 = new policia(99502154, "cortas", 50, "carmen", 35);
       obj1.caminar();
    }
}
