package Projetos_Introducao;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1, n2, resultado;
		char operador;

		System.out.println("Digite o primeiro número: ");
		n1 = scanner.nextDouble();
		System.out.println("Digite o segundo número: ");
		n2 = scanner.nextDouble();
		
		System.out.println("Digite a operação (+, -, *, /): ");
		operador = scanner.next().charAt(0);
		scanner.close();

		switch (operador) {
		case '+':
			resultado = n1 + n2;
			break;
		case '-':
			resultado = n1 - n2;
			break;
		case '*':
			resultado = n1 * n2;
			break;
		case '/':
			resultado = n1 / n2;
			break;
		default:
            System.out.println("Operação inválida.");
            return;
		}

		System.out.println(n1 + " " + operador + " " + n2 + ": " + resultado);
	}
}