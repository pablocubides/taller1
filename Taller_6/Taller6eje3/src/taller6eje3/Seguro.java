package taller6eje3;

public class Seguro {
    // ✅ Encapsulado: nadie puede tocarlo directo
    private double saldo;

    public Seguro(double saldoInicial) {
        if (saldoInicial < 0) {
           throw new IllegalArgumentException("Solo se puede depositar montos positivos.");        }
        this.saldo = saldoInicial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El depósito debe ser positivo.");
        }
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= 0) return false;
        if (cantidad > saldo) return false;
        saldo -= cantidad;
        return true;
    }

    public static void main(String[] args) {
        Seguro banco = new Seguro(1000);
        System.out.println("Saldo inicial (seguro): " + banco.consultarSaldo());

        banco.depositar(500);
        System.out.println("Tras depósito: " + banco.consultarSaldo());

    }
}