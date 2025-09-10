package Ejercicio2.Vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada + "cc");
    }
}