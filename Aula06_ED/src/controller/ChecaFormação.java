package controller;

public class ChecaFormação {
	private DynamicStack crtEspAberto;
	private char[] crtEsp;
	private char[] crtEspFechado;
	
	public ChecaFormação() {
		this.crtEsp = new char[]{'(','['};
		this.crtEspFechado = new char[]{')',']'};
	}
	
	public boolean checaFormacao(String texto){
		for(int i=0; i<texto.length(); i++){
			if(isCrtEsp(texto.charAt(i))){
				crtEspAberto.push(texto.charAt(i));
			}else{
				if(crtEspAberto.pop()){
					
				}
			}
		}
	}
	
	public boolean isCrtEsp(char c){
		int cont = 0;
		for(int i=0; i<crtEsp.length; i++){
			if(c == crtEsp[i]){
				cont++;
			}
		}
		return cont > 0;
	}
	
	public int getIndex(){
		
	}
}
