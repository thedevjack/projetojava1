package curso.java.alex;

import java.util.Date;

public class Pessoa {

	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	private Date data_nascimento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
