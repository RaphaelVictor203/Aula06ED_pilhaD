package controller;

public class ChecaFormacao {
	private DynamicStack crtEspAberto;//Pilha dinamica
	private char[] crtEsp;
	private char[] crtEspFechado;
	
	public ChecaFormacao() {
		this.crtEsp =        new char[]{'<', '{', '(','['};
		this.crtEspFechado = new char[]{'>', '}', ')',']'};
		this.crtEspAberto = new DynamicStack();
	}
	
	
	//Este método checa se houve a abertura e fechamentos de caracteres especiais
	public boolean checaFormacao(String texto) throws EmptyStackException{
		for(int i=0; i<texto.length(); i++){
			if(isCrtEsp(texto.charAt(i), crtEsp)){
				crtEspAberto.push(texto.charAt(i));
			}else{
				if(isCrtEsp(texto.charAt(i), crtEspFechado)) {
					if(crtEspAberto.isEmpty() == false) {
						if(getIndex(crtEspAberto.pop(), 1) != getIndex(texto.charAt(i), 2)){
							return false;
						}
					}else{
						return false;
					}
				}
			}
		}
		if(crtEspAberto.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//Checa, em uma lista de caracteres especiais, se o caracter inserido é especial
	public boolean isCrtEsp(char c, char[] listaCrtEsp){
		boolean existe = false;
		for(int i=0; i<listaCrtEsp.length; i++){
			if(c == listaCrtEsp[i]){
				existe = true;
				break;
			}
		}
		return existe;
	}
	
	public int getIndex(char c, int tipoCrtEsp){
		int index = -1;
		if(tipoCrtEsp==1) {
			for(int i=0; i<crtEsp.length; i++){
				if(c == crtEsp[i]) {
					index = i;
					break;
				}
			}
		}else {
			for(int i=0; i<crtEspFechado.length; i++){
				if(c == crtEspFechado[i]) {
					index = i;
					break;
				}
			}
		}
		return index;
	}
}
