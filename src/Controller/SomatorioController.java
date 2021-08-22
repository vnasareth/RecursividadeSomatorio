package Controller;

public class SomatorioController {

	public SomatorioController() {
	 super();
			 
			}

			// public int fatorial (int numero) essa linha vai receber um numero inteiro
			
			public int Soma (int numero) {
			
				
				//condição de parada // se o numero for igual a 0 retorna 0
			
			     if (numero == 0) {
			      return 0;
		// se for diferente de 0 faça soma + (soma - 1)			
			
			} else {
				
				return numero + Soma (numero - 1);
			   }
			
			}
				
		}