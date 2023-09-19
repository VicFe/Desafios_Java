package Projetos_Introducao;

import java.util.Scanner;

public class celsius_fahrenheit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double celsius, fahrenheit, resultado;
		char formula;

		System.out.println(
				"Deseja converter celsius para fahrenheit (Digite 'c') ou fahrenheit para celsius (Digite 'f'): ");
		formula = scanner.next().charAt(0);

		switch (formula) {
		case 'c':
			System.out.println("Digite a temperatura em celsius: ");
			celsius = scanner.nextDouble();
			resultado = (celsius * 9 / 5) + 32;
			System.out.println(celsius + " graus Celsius é igual a " + resultado + "graus Fahrenheit.");
			break;
		case 'f':
			System.out.println("Digite a temperatura em fahrenheit: ");
			fahrenheit = scanner.nextDouble();
			resultado = (fahrenheit - 32) / 1.8;
			System.out.println(fahrenheit + " graus Fahrenheit é igual a " + resultado + " graus Celsius.");
			break;
		default:
			System.out.println("Operação inválida.");
			return;
		}
	}
}