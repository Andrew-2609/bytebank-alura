package models;

import exceptions.SaldoInsuficienteException;

import java.io.Serializable;

/**
 * @author Andrew Monteiro
 * @version 1.0
 * <p>
 * Essa classe representa o modelo de uma Conta
 */
public class Conta implements Comparable<Conta>, Serializable {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * O construtor da Conta recebe como parâmetros uma agência e um número
     *
     * @param agencia Número da agência
     * @param numero  Número da conta
     */
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        Conta.total++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Atualmente é de: " + this.saldo + ", você está tentando sacar: " + valor);
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Conta)) {
            return false;
        }
        Conta ref = (Conta) obj;
        return (this.agencia == ref.agencia && this.numero == ref.numero);
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return className + "(agencia: " + this.agencia + ", numero: " + this.numero + ". saldo: " + this.saldo + ")";
    }

    @Override
    public int compareTo(Conta conta) {
        return Double.compare(this.saldo, conta.saldo);
    }

}
