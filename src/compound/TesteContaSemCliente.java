package compound;

import models.Cliente;
import models.Conta;

public class TesteContaSemCliente {
    public static void main(String[] args) {
        Conta contaDoArthur = new Conta();

        System.out.println("O nome do titular da nova conta por enquanto é: " + contaDoArthur.titular);

        contaDoArthur.titular = new Cliente();
        contaDoArthur.titular.nome = "Arthur";

        contaDoArthur.depositar(1000.0);

        System.out.println("O titular da conta se chama: " + contaDoArthur.titular.nome + " e possui saldo de: " + contaDoArthur.saldo);
    }
}
