package vetores.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = sc.nextInt();
		
		double[] vectDouble = new double[quantidade];
		
		for (int i = 0; i<vectDouble.length; i++) {
			System.out.print("Digite um numero: ");
			vectDouble[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		System.out.print("\nVALORES = ");
		for (int i = 0; i<vectDouble.length; i++) {
			System.out.print(vectDouble[i] + " ");
			sum += vectDouble[i];
		}
		
		double media = sum / vectDouble.length;
		
		
		System.out.println("\nSOMA = " + sum);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();

	}
	
}
