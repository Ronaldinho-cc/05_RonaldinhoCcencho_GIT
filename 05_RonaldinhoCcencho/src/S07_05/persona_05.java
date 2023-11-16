
package S07_05;

/* @author RonaldinhoCcencho_05 */

public class persona_05 {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    private double altura;

    // Constructor sin parámetros
    public persona_05() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.altura = 0.0;
    }
    // Constructor con parámetros
    public persona_05(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }
    //metodos 
        
    public void Caminar(){
        System.out.println("He caminado");
    }
    public void Mirar(){
        System.out.println("He visto el cielo");
    }
    // Sobrecarga de métodos
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String saludo) {
        System.out.println(saludo + ", Soy " + nombre);
    }

    // Métodos con valores de retorno
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Altura: " + altura + " metros";
    }

    // Métodos con parámetros y argumentos
    public void cumpleanios(int incrementoEdad) {
        edad = incrementoEdad;
        System.out.println("¡Feliz Cumpleaños! Ahora tengo " + edad + " años");
    }

    public void crecer(double incrementoAltura) {
        altura = incrementoAltura;
        System.out.println("He crecido " + incrementoAltura + " metros. Ahora mido " + altura + " metros");
    }
}