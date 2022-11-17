package br.com.java.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSix {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi;	
		double tri, cir, trap, quad, ret;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		
		tri = (A * C) / 2;
		cir = Math.pow(C, 2.0) * pi;
		trap = ((A+B)*C) / 2;
		quad = Math.pow(B, 2.0);
		ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", ret);		
		
		
		sc.close();
	}

}
