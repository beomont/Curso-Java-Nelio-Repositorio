package br.com.java.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFive {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca1, peca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2, valorTotal;
		
		peca1 = sc.nextInt();		
		peca2 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		valorPeca2 = sc.nextDouble();
		valorTotal = (qtdPeca1 * valorPeca1) + (valorPeca2*qtdPeca2);
		
				
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		sc.close();
	}
}
