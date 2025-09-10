
package Ejercicio1.Enpleados;


public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String Nombre, double Salario) {
        this.nombre = Nombre;
        this.salario = Salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario + " pesos");
    }
}
