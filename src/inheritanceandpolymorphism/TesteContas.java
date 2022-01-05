package inheritanceandpolymorphism;

import models.ContaCorrente;
import models.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.depositar(200.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar(800.0);

        cc.transferir(10.0, cp);

        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo ca conta poupança: " + cp.getSaldo());
    }
}
