package Atividades_01;

import java.util.Scanner;

public class Media_de_numeros {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, media;
		
		System.out.println("Digite o primeiro número: ");
		n1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = scanner.nextInt();
		
		media = (n1 + n2) / 2;
		
		System.out.println("A sua média é: " + media);
	}
}