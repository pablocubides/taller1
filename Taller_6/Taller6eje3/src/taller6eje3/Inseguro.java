
package taller6eje3;

public class Inseguro {
    protected double saldo;

    public Inseguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double verSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Inseguro banco = new Inseguro(1000);
        System.out.println("Saldo inicial (inseguro): " + banco.verSaldo());

       
        banco.saldo = -999999;
        System.out.println("Saldo tras fodificar: " + banco.verSaldo());

     
        class Fraude extends Inseguro {
            Fraude(double saldoInicial) {
                super(saldoInicial);
            }
            void robar() {
                this.saldo += 1000000;
            }
        }

        Fraude cf = new Fraude(0);
        cf.robar();
        System.out.println("Saldo de fraude " + cf.verSaldo());
    }
}