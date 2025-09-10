
package Ejercicio1.Enpleados;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() 
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario + " pesos");
        System.out.println("Departamento: " + departamento);
    }
}
