package view;

import controller.ChecaFormacao;
import controller.EmptyStackException;

public class Main {

	public static void main(String[] args) throws EmptyStackException {
		
		ChecaFormacao c = new ChecaFormacao();
		String texto = "(]";//Texto com abertura e fechamento de caracteres especiais
		System.out.println(c.checaFormacao(texto) ? "Forma��o perfeita !!!" : "Forma��o imperfeita !!!");
		
		String texto2 = "<div class='container'></div>";//Exemplo de aplica��o desta checagem, neste caso esta sendo checado se as tags foram fechadas
		System.out.println(c.checaFormacao(texto2) ? "Forma��o perfeita !!!" : "Forma��o imperfeita !!!");
		
		texto = "((((()";//Texto com abertura, mas sem fechamento de caracteres especiais
		System.out.println(c.checaFormacao(texto) ? "Forma��o perfeita !!!" : "Forma��o imperfeita !!!");
		
		

	}

}
