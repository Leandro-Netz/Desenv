package aula1;

import java.util.Scanner;

public class Exemplo9Ex4 {

	public static void main(String[] args) {
		// Programa de convers�o

				
		double valorReais,valorDolar,cotacao;

		       String nome;

		       Scanner ler = new Scanner(System.in);
		                    
		        					
				System.out.println("Digite o Valor em Dolar:  ");
				valorDolar = ler.nextDouble();
				
				System.out.println("Digite o Valor da cota��o: ");
				cotacao = ler.nextDouble();
				
						
				valorReais = valorDolar * cotacao;
				
				System.out.println("O valor em Reais ser� R$ " + valorReais);
				

		
	}

}
