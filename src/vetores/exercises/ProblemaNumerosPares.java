package vetores.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNumerosPares {
	/*
	 * Fa?a um programa que leia N n?meros inteiros e armazene-os em um vetor. Em
	 * seguida, mostre na tela todos os n?meros pares, e tamb?m a quantidade de
	 * n?meros pares.
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = sc.nextInt();

		int[] numeros = new int[quantidade];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		int count = 0;

		System.out.println("\nNUMEROS PARES:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				count++;
			}
		}

		System.out.println("\n\nQUANTIDADE DE PARES = " + count);

		sc.close();

	}

}
