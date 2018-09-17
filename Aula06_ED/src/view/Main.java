package view;

import controller.ChecaFormacao;
import controller.EmptyStackException;

public class Main {

	public static void main(String[] args) throws EmptyStackException {
		
		ChecaFormacao c = new ChecaFormacao();
		String texto = "(()[{<()>}])";//Texto com abertura e fechamento de caracteres especiais
		System.out.println(c.checaFormacao(texto) ? "Formação perfeita !!!" : "Formação imperfeita !!!");
		
		texto = "((((()";//Texto com abertura, mas sem fechamento de caracteres especiais
		System.out.println(c.checaFormacao(texto) ? "Formação perfeita !!!" : "Formação imperfeita !!!");

	}

}
