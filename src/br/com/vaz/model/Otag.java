package br.com.vaz.model;

import java.util.Objects;

public class Otag {
	
	private String nome;
	private String cor;
	private Integer idade;
	
	public Otag() {}

	public Otag(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Otag other = (Otag) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Otag [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
	
	/*public Otag(String nome, String cor, Integer idade) {
	this.nome = nome;
	this.cor = cor;
	this.idade =idade;
 }*/
 

}
