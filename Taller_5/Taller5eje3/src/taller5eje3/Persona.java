package taller5eje3;

public class Persona {

    private String nombre;
    int edad;             

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
     public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);

    }
}