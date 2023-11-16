
package S06_05;

/* @author RonaldinhoCcencho_05S*/

public class Calculadora_05 {
    
    //atributos 
     int a; int b; int mul; int suma; int resta; int dividir ;
    
    //metodos 
    public void sumar (){
     suma = a + b;
    }
    public void resta(){
    resta = a - b;
    }
    public void división (){
      dividir = a / b;
    }
    public void multiplicar(){
    mul = a * b;
    }
    public void salida() {
        System.out.println("El resultado de las operaciones son ");
        System.out.println("La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: " + mul + "\nLa division es: " + dividir );
    }
    //Sobre CargaDeConstructor
    public Calculadora_05(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // Sobrecarga de métodos
    public void sumar(int num1, int num2) {
        System.out.println("La suma es : "+ (num1 + num2));
    }
    
    public void restar(int num1, int num2) {
         System.out.println("La resta es : " + (num1 - num2));
    }
    
    public void multiplicar(int num1, int num2) {
        System.out.println("La multiplicacion es : "+ (num1 * num2));
    }
    public void dividir(int num1 , int num2){
        System.out.println("La division es : "+ (num1 /num2));
    }
   // Método con valor de retorno
   public int sum( ) {
   suma = a + b;
   return suma;
    }
   public int res(){
   resta = a - b;
   return resta;
   }
   public int dividir(){
   dividir = a / b ;
   return dividir;
   }
   public int multi(){
   mul = a*b ;
   return mul;
   }

}



 
