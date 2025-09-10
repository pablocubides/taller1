package taller5eje1;


public class PruebaProducto {
    public static void main(String[] args) {
   
        
        
        Producto pr1 = new Producto("pc", 2500.50, 10);
        Producto pr2 = new Producto("celular", 1200.00, 20);
        

        pr1.mostrarInfo();
        pr2.mostrarInfo();

    
        System.out.println("Acceso directo al stock de " + pr1.nombre + ": " + pr1.stock);
    }
}