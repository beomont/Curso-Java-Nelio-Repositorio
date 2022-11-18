package vetores.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetores {
	/*
	 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
	 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
	 * elementos correspondentes de A e B. Imprima o vetor C gerado.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantidade = sc.nextInt();

		int[] a = new int[quantidade];
		int[] b = new int[quantidade];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		int[] vetorResultante = new int[quantidade];
		
		System.out.println("VETOE RESULTANTE: ");
		if (b.length == a.length) {
			for (int i = 0; i < b.length; i++) {
				vetorResultante[i] = a[i] + b[i];
				System.out.println(vetorResultante[i]);
			}
		}
		
		List<Integer> teste = new ArrayList();
		teste.add(5);		
		System.out.println(teste.get(0));
		
		sc.close();
	}

}
