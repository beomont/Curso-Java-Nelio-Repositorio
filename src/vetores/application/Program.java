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
		
		
		//Lê os produtos, intancias os objetos e guarda na posição do vetor
		for(int i=0; i<vect.length; i++) {	
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();			
			vect[i] = new Product(name, price);			
		}
		
		//Pegando o preço para tirar a média do preço dos produtos
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double media = sum/vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", media);	
		
		
		sc.close();
		
		
	
	}


}
