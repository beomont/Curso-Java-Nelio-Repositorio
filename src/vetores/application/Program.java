package vetores.application;

import java.util.Locale;
import java.util.Scanner;

import vetores.entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade = sc.nextInt();
		Product[] vect = new Product[quantidade];
		double sum = 0.0;
		
		
		//L� os produtos, intancias os objetos e guarda na posi��o do vetor
		for(int i=0; i<vect.length; i++) {	
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();			
			vect[i] = new Product(name, price);			
		}
		
		//Pegando o pre�o para tirar a m�dia do pre�o dos produtos
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double media = sum/vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", media);	
		
		
		sc.close();
		
		
	
	}


}
