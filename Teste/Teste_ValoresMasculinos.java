package Teste;

import org.junit.Assert;

import org.junit.Test;
import valores.Valores_Masculinos;
public class Teste_ValoresMasculinos {

	@Test
    public void testCalcularValoresMasculinos_IdadeMenorIgual15() {
        double mensalidade = Valores_Masculinos.calcularValores_Masculinos(12, "M");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularValoresMasculinos_IdadeEntre16e18() {
        double mensalidade = Valores_Masculinos.calcularValores_Masculinos(17, "M");
        Assert.assertEquals(75.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularValoresMasculinos_IdadeEntre19e30() {
        double mensalidade = Valores_Masculinos.calcularValores_Masculinos(25, "M");
        Assert.assertEquals(90.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularValoresMasculinos_IdadeEntre31e40() {
        double mensalidade = Valores_Masculinos.calcularValores_Masculinos(35, "M");
        Assert.assertEquals(85.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularValoresMasculinos_IdadeEntre41e50() {
        double mensalidade = Valores_Masculinos.calcularValores_Masculinos(45, "M");
        Assert.assertEquals(80.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularValoresMasculinos_IdadeMaior50() {
        double mensalidade =Valores_Masculinos.calcularValores_Masculinos(55, "M");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularValoresMasculinos_SexoInvalido() {
        double mensalidade = Valores_Masculinos.calcularValores_Masculinos(30, "F");
        Assert.assertEquals(0.0, mensalidade, 0.01);
	}

}
