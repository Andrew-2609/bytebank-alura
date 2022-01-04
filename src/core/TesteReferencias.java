package core;

import models.Conta;

@SuppressWarnings("ALL")
public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = primeiraConta;
        Conta terceiraConta = new Conta();

        if (primeiraConta == segundaConta) {
            System.out.println("A primeira e a segunda conta são iguais, pois apontam para o mesmo objeto.");
        } else {
            System.out.println("A primeira e a segunda conta não são iguais, são objetos diferentes.");
        }

        if (primeiraConta != terceiraConta && segundaConta != terceiraConta) {
            System.out.println("A primeira e a segunda contas são diferentes da terceira, pois ela aponta para um outro objeto.");
        } else {
            System.out.println("Todas as contas são iguais.");
        }

        System.out.println("primeiraConta:\t" + primeiraConta);
        System.out.println("segundaConta:\t" + segundaConta);
        System.out.println("terceiraConta:\t" + terceiraConta);
    }
}
