package vehiculos;


class Vehiculo {
    String tipo;
    


    Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    

    void mostrarInfo() {
        System.out.println("Vehículo de tipo: " + tipo);
    }
}