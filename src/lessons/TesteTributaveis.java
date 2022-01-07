package lessons;

import models.CalculadorDeImposto;
import models.ContaCorrente;
import models.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(231, 928);
        contaCorrente.depositar(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registrar(contaCorrente);
        calculadorDeImposto.registrar(seguroDeVida);

        System.out.println("Total de impostos: " + calculadorDeImposto.getTotalImposto());
    }
}
