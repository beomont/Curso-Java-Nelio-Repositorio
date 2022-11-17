import java.util.Locale;

public class PrintF {

	public static void main(String[] args) {
		double x = 10.35578;
		System.out.println("Hello World!");
		System.out.println(x);
		System.out.printf("%.2f%n", x); //Delimita casas decimais
		System.out.printf("%.4f%n", x); 
		//Locale.setDefault(Locale.US); //Determina a linguagem do computador, ou seja, por padrão os numeros virão separados por . ao invés de ,
		System.out.printf("%.2f%n", x); //Teste número 10.36 ao invés de 10,36.
		System.out.println("Resultado: " + x + " Metros");
		System.out.printf("Resultado: %.2f Metros%n%n", x);
		
		/*Marcadores printF:
		 * %f = float
		 * %d = inteiro
		 * %s = String
		 * %n = quebra de linha
		 */
		
		String nome = "Maria";
		int idade = 43;
		double renda = 4000.00;
		
		//System.out.printf("%s tem %d anos e ganha em torno de R$ %.1f reais %n", nome, idade, renda);
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50; 
		double measure = 52.234567;
		
		System.out.println("Products:");
		System.out.println(product1 + ", wich pprice is $ " + price1 + "\n" + 
						   product2 + ", wich pprice is $ " + price2+"\n");
		
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		
		System.out.printf("\nMeasure with eight decimal places: %.8f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
				
	}

}
