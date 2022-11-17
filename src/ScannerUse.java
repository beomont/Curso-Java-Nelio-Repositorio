import java.util.Locale;
import java.util.Scanner;

public class ScannerUse {

	public static void main(String[] args) {		
		
		System.out.println("Digite os valores:\n"
				+ "String, Inteiro, Double(US), Char");
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int y = sc.nextInt();
		double w = sc.nextDouble();
		char c = sc.next().charAt(0);

		System.out.println("String: " + x);			
		System.out.println("Inteiro: " + y);		
		System.out.println("Double: " + w);		
		System.out.println("Char: " + c );
		
		
		sc.close();
	}

}
