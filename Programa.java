import java.util.Scanner;
import valores.Valores_Femininos;
import valores.Valores_Masculinos;
public class Programa {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe a idade do cliente: ");
	        int idade = scanner.nextInt();

	        System.out.print("Informe o sexo do cliente (M/F): ");
	        String sexo = scanner.next();
	        
	        double mensalidade;


	        if (sexo.equalsIgnoreCase("M")) {
	            mensalidade = Valores_Masculinos.calcularValores_Masculinos(idade, sexo);
	        } else if (sexo.equalsIgnoreCase("F")) {
	            mensalidade = Valores_Femininos.calcularValores_Femininos(idade, sexo);
	        } else {
	            System.out.println("Sexo inválido.");
	            mensalidade = 0.0;
	        }

	        System.out.println("Valor da mensalidade: R$" + mensalidade);

	        scanner.close();
	    }
	    }