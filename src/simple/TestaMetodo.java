package simple;

import models.Conta;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.saldo = 500;
        conta.depositar(50);
        System.out.println(conta.saldo);

        boolean conseguiuSacar = conta.sacar(200);
        if (conseguiuSacar) {
            System.out.println(conta.saldo);
        }

        Conta segundaConta = new Conta();

        boolean conseguiuTransferir = conta.transferir(100, segundaConta);

        if (conseguiuTransferir) {
            System.out.println("Saldo da conta original após a transferência: " + conta.saldo);
            System.out.println("Saldo da segunda conta após a transferência: " + segundaConta.saldo);
        }
    }
}
