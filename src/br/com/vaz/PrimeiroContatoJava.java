package br.com.vaz;

import br.com.vaz.model.Otag;

public class PrimeiroContatoJava {

	public static void main(String[] args) {
		
		Otag otag = new Otag();
		Livros livros = new Livros();
		
		System.out.println(otag);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("HELLO WORLD " + (a+b));*/		
	}

}
class Livros {
	private String nome;
	private String npag;
		 
 }