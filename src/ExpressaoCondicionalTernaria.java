
public class ExpressaoCondicionalTernaria {
	
	//sintaxe:
	//(condição) ? valor_se_verdadeiro : valor_se_falso
	public static void main(String[] args) {
	
		double preco = 34.5;
		double desconto;
		
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}	
		System.out.println(desconto);
		
		
		//COM CONDIÇÃO TERNÁRIA		
		double valor = 34.5;
		double desconte = (valor < 20.0) ? valor * 0.1 : valor * 0.05;
		
		System.out.println(desconte);
		
			
	}
	

}
