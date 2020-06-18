package aula1;

import java.util.Scanner;

public class Exemplo9Ex4 {

	public static void main(String[] args) {
		// Programa de conversão

				
		double valorReais,valorDolar,cotacao;

		       String nome;

		       Scanner ler = new Scanner(System.in);
		                    
		        					
				System.out.println("Digite o Valor em Dolar:  ");
				valorDolar = ler.nextDouble();
				
				System.out.println("Digite o Valor da cotação: ");
				cotacao = ler.nextDouble();
				
						
				valorReais = valorDolar * cotacao;
				
				System.out.println("O valor em Reais será R$ " + valorReais);
				

		
	}

}
