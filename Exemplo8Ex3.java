package aula1;

import java.util.Scanner;

public class Exemplo8Ex3 {

	public static void main(String[] args) {
		// Calcular o salario do venderor
		
double salariofixo,valorvendas,salariofinal,comissao;

       String nome;

       Scanner ler = new Scanner(System.in);
                    
        comissao = 0.15;
        System.out.println(comissao);
					
		System.out.println("Digite seu nome:  ");
		nome = ler.next();
		
		System.out.println("Digite seu salario fixo: ");
		salariofixo = ler.nextDouble();
		
		System.out.println("Digite seu o valor total das suas vendas: ");
		valorvendas = ler.nextDouble();
		
		salariofinal = salariofixo + valorvendas * comissao;
		
		System.out.println("o seu salário deste mês será " + salariofinal);
		

	}

}
