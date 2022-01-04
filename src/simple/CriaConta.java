package simple;

import models.Conta;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(200);
        System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.depositar(50);
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
    }
}
