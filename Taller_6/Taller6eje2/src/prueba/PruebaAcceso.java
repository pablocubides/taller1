package prueba;

import Ejercicio2.Vehiculos.Vehiculo;
import Ejercicio2.Vehiculos.Moto;

public class PruebaAcceso {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Automovil", "kia");
        Moto m = new Moto("Moto", "Bell", 150);

        System.out.println("_-- Probando accesos --_");
        v.mostrarDetalles();
        m.mostrarDetalles();
         v.tipo = "Camión";
         v.marca = "Honda"; 

        m.tipo = "Scooter";
        m.marca = "Suzuki"; 
           }
}
