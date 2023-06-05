package valores;

public class Valores_Masculinos {
	 private static double mensalidade;
	public static double calcularValores_Masculinos(int idade, String sexo) {

	        if (sexo.equalsIgnoreCase("M")) {
	            if (idade <= 15) {
	                setMensalidade(60.0);
	            } else if (idade <= 18) {
	                setMensalidade(75.0);
	            } else if (idade <= 30) {
	                setMensalidade(90.0);
	            } else if (idade <= 40) {
	                setMensalidade(85.0);
	            } else if (idade <= 50) {
	                setMensalidade(80.0);
	            } else {
	                setMensalidade(60.0);
	            }
	        } else {
	            System.out.println("Sexo inválido.");
	            setMensalidade(0.0);
	        }

	        return getMensalidade();
	    }


	    public static double getMensalidade() {
	        return mensalidade;
	    }


	    public static void setMensalidade(double mensalidade) {
	    	Valores_Masculinos.mensalidade = mensalidade;
	    }
}
