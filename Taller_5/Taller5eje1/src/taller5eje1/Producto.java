
package taller5eje1; 


class Producto {
    
    
    String nombre;
    double precio;
    int stock;

    
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    
    void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println( "Precio: " + precio + " pesos" );
        System.out.println("Stock disponible: " + stock);
    }
}