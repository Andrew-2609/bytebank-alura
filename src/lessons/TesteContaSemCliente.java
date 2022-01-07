package lessons;

import models.Cliente;
import models.Conta;

public class TesteContaSemCliente {
    public static void main(String[] args) {
        Conta contaDoArthur = new Conta(12, 4423);

        System.out.println("O nome do titular da nova conta por enquanto é: " + contaDoArthur.getTitular());

        contaDoArthur.setTitular(new Cliente());
        contaDoArthur.getTitular().setNome("Arthur");

        contaDoArthur.depositar(1000.0);

        System.out.println("O titular da conta se chama: " + contaDoArthur.getTitular().getNome() + " e possui saldo de: " + contaDoArthur.getSaldo());
    }
}
