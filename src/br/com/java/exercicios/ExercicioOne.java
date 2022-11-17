package br.com.java.exercicios;

public class ExercicioOne {
	public static void main(String[] args) {

		int somaImp = 0;
		int contador = 0;
		int qtdImp = 0;
		int media;

		while (contador <= 1000) {
			if ((contador % 2) != 0) {
				somaImp += contador;
				qtdImp++;
			}
			contador++;
		}
		media = somaImp / qtdImp;

		System.out.printf("Soma de todos os n\u00FAmeros \u00EDmpares (1 a 1000) \u00E9: %n%d%n%n", somaImp);
		System.out.printf("Quantidade de n\u00FAmeros \u00EDmpares (1 a 1000) \u00E9: %n%d%n%n", qtdImp);
		System.out.printf("M\u00E9dia da soma de n\u00FAmeros \u00EDmpares (1 a 1000) \u00E9: %n%d%n%n", media);

	}
}
