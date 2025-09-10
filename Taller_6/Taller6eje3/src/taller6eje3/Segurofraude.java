/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6eje3;


public class Segurofraude {
    // ✅ Encapsulado: nadie puede tocarlo directo
    private double saldo;

    public Segurofraude(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Solo se puede depositar montos positivos.");
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
        Segurofraude banco = new Segurofraude(1000);
        System.out.println("Saldo inicial (seguro): " + banco.consultarSaldo());

        banco.depositar(500);
        System.out.println("Tras depósito: " + banco.consultarSaldo());
        banco.saldo = 999999; 
    }
}