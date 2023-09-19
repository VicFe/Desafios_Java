package Atividades_01;

import java.util.Scanner;

public class Area_do_Triangulo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base, altura, area;
		
		System.out.println("Digite o valor da base: ");
		base = scanner.nextInt();
		
		System.out.println("Digite o valor da altura: ");
		altura = scanner.nextInt();
		
		area = (base*altura) / 2;
		
		System.out.println("O valor da área é: " + area);
	}
}