package vetores.exercises;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import vetores.entities.Pessoa;

public class VetoresAlturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int quantidade = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[quantidade];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %d pessoa:%n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
		}

		double percentMenosDezesseis = 0.0;
		int countMenosDezesseis = 0;
		double sum = 0.0;

		for (int i = 0; i < pessoa.length; i++) {
			sum += pessoa[i].getAltura();			
			if (pessoa[i].getIdade() < 16) {				
				countMenosDezesseis++;
			}
		}	

		double media = sum / pessoa.length;
		System.out.printf("%nAltura media: %.2f%n", media);
		
		percentMenosDezesseis = (countMenosDezesseis * 100.00 / pessoa.length);
		DecimalFormat df = new DecimalFormat("###,#0.0");
		
		System.out.println("Pessoas com menos de 16 anos: " + df.format(percentMenosDezesseis) + "%");
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());;
			}
		}

		sc.close();

	}

}
