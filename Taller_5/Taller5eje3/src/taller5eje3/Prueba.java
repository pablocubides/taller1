package taller5eje3;

public class Prueba {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 20);

        System.out.println("Edad: " + p.edad);

      
        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("María");
        System.out.println("Nuevo nombre: " + p.getNombre());
    }
}