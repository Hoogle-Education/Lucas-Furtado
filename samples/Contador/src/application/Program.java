package application;

public class Program {

	public static void main(String[] args) {

		int numero = 1; // inicializa��o
		
		while( true ) { // verifica��o
						
			if(numero >= 10 ) {
				System.out.println("Fim! | numero = " + numero); 
				break;
			} 
			
			numero++; // atualiza��o
			
			if(numero%2 != 0) {
				System.out.println("Continuando... | numero = " + numero); 
			}			
			
		}
		
	}

}
