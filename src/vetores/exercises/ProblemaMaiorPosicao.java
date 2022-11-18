package vetores.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaiorPosicao {
	/*
	 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
	 * seguida, mostrar na tela o maior n�mero do vetor (supor n�o haver empates).
	 * Mostrar tamb�m a posi��o do maior elemento, considerando a primeira posi��o
	 * como 0 (zero).
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = sc.nextInt();

		double[] maiorPosicao = new double[quantidade];

		// Popula array com os inserts
		for (int i = 0; i < maiorPosicao.length; i++) {
			System.out.print("Digite um numero: ");
			maiorPosicao[i] = sc.nextDouble();
		}

		double maiorValor = maiorPosicao[0];
		int posicaoMaior = 0;

		for (int i = 0; i < maiorPosicao.length; i++) {	
			if (maiorPosicao[i] > maiorValor) {
				maiorValor = maiorPosicao[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
		
		sc.close();

	}

}
