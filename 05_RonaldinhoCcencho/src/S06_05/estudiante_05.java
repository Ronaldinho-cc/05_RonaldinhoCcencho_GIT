
package S06_05;
/*  @author RonaldinhoCcencho_05 */
    public class Estudiante_05 {
        
    //Atributos clase estudiante_05
    private String nombre;
    private int edad;
    private String materia;
    
    // SobreCarga de Constructor clase Estudiante_05 
    public Estudiante_05(String nombre, int edad, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }
    
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
    //metodos 
    public void nombre(){
        System.out.println("El nombre es : " + nombre);
    }  
    public void materia (){
        System.out.println("La materia es : " + materia);
    }
    public void edad(){
        System.out.println("Su edad es : " + edad);
    }
    // Sobrecarga de métodos
    public void estudiar(String nombre) {
        System.out.println("El estudiante " + nombre + " esta estudiando.");
    }
    public void estudiar(String materia ,String nombre) {
        System.out.println("El estudiante " + nombre + " esta estudiando " + materia + ".");
    }
    // Método con valor de retorno
    public String obtenerInformacion() {
        return "El estudiante " + nombre + " de  " + edad +" años "+" esta estudiando la materia de " + materia;
    }
}

    
