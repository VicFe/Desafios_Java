package Atividades_01;

import java.util.Scanner;

public class Volume_Esfera {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int raio;
		float pi = 3.14f, volume;

		System.out.println("Digite o valor do raio: ");
		raio = scanner.nextInt();

		volume = (4 / 3) * pi * raio * raio * raio;

		System.out.println("O volume da esfera é: " + volume);
	}
}