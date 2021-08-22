package view;

import Controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		
      SomatorioController somaC = new SomatorioController();
		
		int numero = 6;
		
		int Somatorio = somaC.Soma(numero);
		
		System.out.println ("resultado do somatorio : " + Somatorio);

	}

}
