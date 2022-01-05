package models;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.2;
        return super.sacar(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
