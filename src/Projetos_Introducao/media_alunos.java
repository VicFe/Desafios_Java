package Projetos_Introducao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class media_alunos {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, nota5, media;
		int notas;
		char avaliacao;

		System.out.println("Quantas notas você deseja adicionar (opções: 2, 3, 4 e 5): ");

		try {
			notas = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Erro: Você não digitou um número válido.");
			return;
		}

		switch (notas) {
		case 2:
			System.out.println("Digite a primeira nota: ");
			nota1 = scanner.nextDouble();

			System.out.println("Digite a segunda nota: ");
			nota2 = scanner.nextDouble();

			media = (nota1 + nota2) / 2;
			System.out.println("Sua media é: " + media);
			break;
		case 3:
			System.out.println("Digite a primeira nota: ");
			nota1 = scanner.nextDouble();

			System.out.println("Digite a segunda nota: ");
			nota2 = scanner.nextDouble();

			System.out.println("Digite a terceira nota: ");
			nota3 = scanner.nextDouble();

			media = (nota1 + nota2 + nota3) / 3;
			System.out.println("Sua media é: " + media);
			break;
		case 4:
			System.out.println("Digite a primeira nota: ");
			nota1 = scanner.nextDouble();

			System.out.println("Digite a segunda nota: ");
			nota2 = scanner.nextDouble();

			System.out.println("Digite a terceira nota: ");
			nota3 = scanner.nextDouble();

			System.out.println("Digite a quarta nota: ");
			nota4 = scanner.nextDouble();

			media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println("Sua media é: " + media);
			break;
		case 5:
			System.out.println("Digite a primeira nota: ");
			nota1 = scanner.nextDouble();

			System.out.println("Digite a segunda nota: ");
			nota2 = scanner.nextDouble();

			System.out.println("Digite a terceira nota: ");
			nota3 = scanner.nextDouble();

			System.out.println("Digite a quarta nota: ");
			nota4 = scanner.nextDouble();

			System.out.println("Digite a quinta nota: ");
			nota5 = scanner.nextDouble();

			media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
			System.out.println("Sua media é: " + media);
			break;
		default:
			System.out.println("Operação inválida.");
			return;
		}

		System.out.println("Gostaria de saber se você passou? sim (s), não (n)");
		avaliacao = scanner.next().charAt(0);

		if (avaliacao == 's') {
			if (media >= 7.0) {
				System.out.println("Parabens você passou!");
			} else {
				System.out.println("Infelizmente você foi reprovado.");
			}
		} else {
			System.out.println("Tudo bem então.");
		}
	}
}