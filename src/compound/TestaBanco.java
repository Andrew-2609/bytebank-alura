package compound;

import models.Cliente;
import models.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente primeiroCliente = new Cliente();
        primeiroCliente.setNome("Andrew Monteiro");
        primeiroCliente.setCpf("909.909.909-09");
        primeiroCliente.setProfissao("Programador");

        Conta conta = new Conta(12, 4423);
        conta.depositar(2000.0);
        conta.setTitular(primeiroCliente);

        System.out.println("Nome do titular da conta: " + conta.getTitular().getNome());
    }
}
