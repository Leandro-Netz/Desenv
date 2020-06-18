package aula1;

import java.util.Scanner;

public class Exemplo7Ex2 {

	public static void main(String[] args) {
		// Determinar o consumo médio sendo fornecida a KM total e total de combustível gasto

		double Kilometragem,consumo,consumomedio;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite a distância percorrida:  ");
		Kilometragem = ler.nextDouble();
		
		System.out.println("Digite a quantidade de litros que foi consumido: ");
		consumo = ler.nextDouble();
		
		consumomedio = consumo / Kilometragem;
		
		System.out.println("O consumo médio do seu veículo é " + consumomedio + "Litros por Kilômetro ");
		
		
		
	}

}
