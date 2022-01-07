package lessons;

import models.ContaCorrente;
import models.ContaPoupanca;

public class TesteString {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123, 432);
        contaCorrente.depositar(1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(890, 987);
        contaPoupanca.depositar(3000.0);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
