package br.com.java.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFour {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int funcionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d%n",funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		sc.close();
	}

}
