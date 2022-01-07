package lessons;

import models.Conta;

public class TestaValores {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(113, 238664);
        Conta segundaConta = new Conta(113, 238665);
        System.out.println("O número da primeira conta é: " + primeiraConta.getNumero());
        System.out.println("A agência da segunda conta é: " + segundaConta.getAgencia());

        System.out.println("O total de contas cadastradas é: " + Conta.getTotal());
    }
}
