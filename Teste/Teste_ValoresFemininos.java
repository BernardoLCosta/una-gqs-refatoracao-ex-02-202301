package Teste;

import org.junit.Assert;

import org.junit.Test;
import valores.Valores_Femininos;
public class Teste_ValoresFemininos {

	  @Test
	    public void testCalcularValoresFemininos_IdadeMenorIgual18() {
	        double mensalidade = Valores_Femininos.calcularValores_Femininos(15, "F");
	        Assert.assertEquals(60.0, mensalidade, 0.01);
	    }

	    @Test
	    public void testCalcularValoresFemininos_IdadeEntre19e25() {
	        double mensalidade =Valores_Femininos.calcularValores_Femininos(20, "F");
	        Assert.assertEquals(90.0, mensalidade, 0.01);
	    }

	    @Test
	    public void testCalcularValoresFemininos_IdadeEntre26e40() {
	        double mensalidade =Valores_Femininos.calcularValores_Femininos(30, "F");
	        Assert.assertEquals(85.0, mensalidade, 0.01);
	    }

	    @Test
	    public void testCalcularValoresFemininos_IdadeEntre41e50() {
	        double mensalidade = Valores_Femininos.calcularValores_Femininos(45, "F");
	        Assert.assertEquals(65.0, mensalidade, 0.01);
	    }

	    @Test
	    public void testCalcularValoresFemininos_IdadeMaior50() {
	        double mensalidade = Valores_Femininos.calcularValores_Femininos(55, "F");
	        Assert.assertEquals(50.0, mensalidade, 0.01);
	    }

	    @Test
	    public void testCalcularValoresFemininos_SexoInvalido() {
	        double mensalidade =Valores_Femininos.calcularValores_Femininos(30, "M");
	        Assert.assertEquals(0.0, mensalidade, 0.01);
	}

}
