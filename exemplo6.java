package aula1;

import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
		

	
		Scanner ler = new Scanner (System.in);
		
		int idade;
		String nome,sobrenome;
		
		System.out.println ("Digite seu nome:");
		
		nome = ler.next();
		
        System.out.println ("Seu nome �:  "  + nome);
		
                
        System.out.println ("Digite seu sobrenome:");
        
		sobrenome = ler.next();
		
		System.out.println("Seu sobrenome � "  + sobrenome);
		
				
		System.out.println ("Digite sua idade:");
		
		idade = ler.nextInt();
		
		System.out.println("Sua idade �: "   + idade);
		
		
		
		System.out.println ("Seu nome completo �: " + nome + " "   +  sobrenome + " " +  "idade = : " + idade);

	}

}

