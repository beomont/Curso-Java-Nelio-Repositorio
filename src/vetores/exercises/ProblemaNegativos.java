package vetores.exercises;

import java.util.Scanner;

public class ProblemaNegativos {
	
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Quantos numeros voce vai digitar? ");
		 int quantidade = sc.nextInt();
		 int[] vectInteiros = new int[quantidade];
		 
		 for (int i = 0; i<vectInteiros.length; i++) {
			 System.out.print("Digite um numero: ");			 
			 vectInteiros[i] = sc.nextInt();			 
		 }
		 
		 System.out.println("NUMEROS NEGATIVOS:");
		 int count = 0;
		 for (int i = 0; i<vectInteiros.length; i++) {			 
			 if (vectInteiros[i]<0) {
				 System.out.println(vectInteiros[i]);
				 count++;
			 }			 
		 }
		 System.out.println("Total de Números Negativos:" + count);
			
		 
		 
		 sc.close();
		 
	}

}
