/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_05_E01;

/**
 *
 * @author GIGABYTE
 */
public class Main_S11_05_E01 {
       
    public static void main(String[] args){
       bombero_05_E01 obj1 = new bombero_05_E01(1, 150, "corto", "marcela",12);
       obj1.caminar();
       
       medico_05_E01 obj2 = new medico_05_E01(2, 20, "jose", "mariela",20);
       obj1.caminar();
       
       policia_05_E01 obj3 = new policia_05_E01(99502154, "cortas", 50, "carmen", 35);
       obj1.caminar();
    }
}
