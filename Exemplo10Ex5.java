package aula1;

import java.util.Scanner;

public class Exemplo10Ex5 {

	public static void main(String[] args) {
		// Calculo de Juros

		
		double valordepositado,valorcomjuros,juros;

	    String nome;

				       Scanner ler = new Scanner(System.in);
				        
				       juros = 0.007;
				       System.out.println(juros);
				   	
				   				        					
						System.out.println("Digite o Valor a depositar:  ");
						valordepositado = ler.nextDouble();
							
						valorcomjuros = valordepositado * juros;
						
						System.out.println("O valor com juros em 30 dias será R$ " + valordepositado + valorcomjuros);
						
				
			}

		}

		