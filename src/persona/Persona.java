package persona;

public class Persona {
  
  private String nombre;
  private String apellidos;
  private int edad;
  
  Persona(String nombre, String apellidos, int edad){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  public int Cumpleaños() {
    edad++;
    System.out.println("La edad es de " + edad);
    return edad;
  }
}
