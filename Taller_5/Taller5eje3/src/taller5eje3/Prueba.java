package taller5eje3;

public class Prueba {
    public static void main(String[] args) {
        Persona p = new Persona("Juna", 20);

        System.out.println("Edad: " + p.edad);

      
        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("Juana");
        System.out.println("Nuevo nombre: " + p.getNombre());
        System.out.println("Edad: " + p.edad);
        p.edad = 21;
        System.out.println("Nueva edad: " + p.edad);
    }
}