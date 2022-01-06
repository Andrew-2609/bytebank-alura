package exceptions;

import models.ContaCorrente;

public class TesteSacar {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 321);
        cc.depositar(200.0);
        try {
            cc.sacar(210.0);
        } catch (SaldoInsuficienteException sie) {
            System.out.println(sie.getMessage());
        }
        System.out.println("Saldo atual: " + cc.getSaldo());
    }
}
