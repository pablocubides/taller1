
package taller6eje3;



class Banco {
    private double saldo;

    public Banco(double saldoInicial) { this.saldo = saldoInicial; }
    public double getSaldo() { return saldo; }
    public void depositar(double monto) { if (monto > 0) saldo += monto; }
    public void retirar(double monto) { if (monto > 0 && monto <= saldo) saldo -= monto; }
}

public class Seguro {
    public static void main(String[] args) {
        Banco b = new Banco(1000);
        b.depositar(500);
        b.retirar(200);
        System.out.println("Saldo final: " + b.getSaldo());
    }
}