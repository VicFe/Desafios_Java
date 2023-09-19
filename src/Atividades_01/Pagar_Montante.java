package Atividades_01;

import java.util.Scanner;

public class Pagar_Montante {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int preco, quantidade, total;
		
		System.out.println("Introduza o preço do kWh: ");
		preco = scanner.nextInt();
		
		System.out.println("Introduz os kWh consumidos: ");
		quantidade = scanner.nextInt();
		
		total = preco * quantidade;
		
		System.out.println("O valor total a pagar é: " + total);
	}
}