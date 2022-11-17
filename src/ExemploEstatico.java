import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ExemploEstatico {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Ente com o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		
		double v = Calculator.volume(raio);
		
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		
		sc.close();
		
	}

	
	

}
