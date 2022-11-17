package vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorNelioAlvesPt1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de alturas: ");
		
		int quantidade = sc.nextInt();		
		double[] vect = new double[quantidade];
		double sum = 0.0;
		
		for (int i = 0; i<quantidade;i++) {
			System.out.printf("Insira sua #%d altura: ", i+1);
			vect[i] = sc.nextDouble(); //Insere vetor em cada posição
			sum += vect[i]; //soma valor dos vetores
		}		
	
		double avg = sum / quantidade; //média dos vetores
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);		
		
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		sc.close();
	}

}
