package core;

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
    }
}
