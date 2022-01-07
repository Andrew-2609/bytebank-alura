package lessons;

import models.Conta;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(12, 3345);
        primeiraConta.depositar(200);
        System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());

        Conta segundaConta = new Conta(12, 3346);
        segundaConta.depositar(50);
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
    }
}
