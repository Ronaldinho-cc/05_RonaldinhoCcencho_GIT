/*
 */
package S07_05_Ejercicios;

/* @author RonaldinhoCcencho_05 */
public class Main {
    
    public static void main(String[] args) {
      //Persona 1  metodos con parametros 
      persona1_05 Per1 = new persona1_05();
      Per1.Hablar("Jose");
      Per1.caminar("Roberto");
      Per1.edad(35);
      
      //persona 2 metodos con valores de retorno 
      persona2_05 per2 = new persona2_05();
        System.out.println(per2.Saludo());
        System.out.println("Tengo " + per2.edad()+ " años");
        System.out.println("Mi numero telefonico es : " + per2.telefono());
    }
    
}
