package compound;

import models.Cliente;
import models.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente primeiroCliente = new Cliente();
        primeiroCliente.nome = "Andrew Monteiro";
        primeiroCliente.cpf = "909.909.909-09";
        primeiroCliente.profissao = "Programador";

        Conta conta = new Conta();
        conta.depositar(2000.0);
        conta.titular = primeiroCliente;

        System.out.println("Nome do titular da conta: " + conta.titular.nome);
    }
}
