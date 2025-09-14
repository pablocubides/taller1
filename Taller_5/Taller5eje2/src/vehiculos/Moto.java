package vehiculos;


public class Moto extends Vehiculo {
    

    public Moto(String tipo) {
        super(tipo);
    }
    

       public void mostrarMoto() {
        System.out.println("Soy una moto de tipo: " + tipo);
    }
}