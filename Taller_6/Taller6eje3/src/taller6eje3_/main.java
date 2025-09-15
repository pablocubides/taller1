package taller6eje3_;

class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}

class Robo extends Banco {
    public Robo(double saldoInicial) { super(saldoInicial); }
    public void robar() { saldo = 9999999; }
}

public class main {
    public static void main(String[] args) {
        Robo r = new Robo(1000);
        System.out.println("Saldo inicial: " + r.saldo);
        r.robar();
        System.out.println("Saldo despues del robo: " + r.saldo);
    }
}