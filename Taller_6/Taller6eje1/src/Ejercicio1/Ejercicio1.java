package Ejercicio1;

import Ejercicio1.Enpleados.Empleado;
import Ejercicio1.Enpleados.Gerente;

public class Ejercicio1 {

    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan", 2500.0);
        Gerente ger = new Gerente("Jose", 5000.0, "Director TIC");

        System.out.println("Empleado");
        emp.mostrarInformacion();

        System.out.println("Gerente");
        ger.mostrarInformacion();
    }
}