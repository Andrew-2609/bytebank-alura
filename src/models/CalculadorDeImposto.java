package models;

public class CalculadorDeImposto {

    private double totalImposto;

    public void registrar(Tributavel tributavel) {
        this.totalImposto += tributavel.getValorImposto();
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }

}
