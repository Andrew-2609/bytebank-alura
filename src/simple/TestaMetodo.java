package simple;

import models.Conta;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta(12, 3345);

        conta.depositar(500);
        conta.depositar(50);
        System.out.println(conta.getSaldo());

        conta.sacar(200);
        System.out.println(conta.getSaldo());

        Conta segundaConta = new Conta(12, 3346);

        boolean conseguiuTransferir = conta.transferir(100, segundaConta);

        if (conseguiuTransferir) {
            System.out.println("Saldo da conta original após a transferência: " + conta.getSaldo());
            System.out.println("Saldo da segunda conta após a transferência: " + segundaConta.getSaldo());
        }
    }
}
