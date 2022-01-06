package exceptions;

import models.ContaCorrente;

public class TesteSacar {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 321);
        cc.depositar(200.0);
        cc.sacar(210.0);
        System.out.println(cc.getSaldo());
    }
}
