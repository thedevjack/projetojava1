package curso.java.alex;

import java.util.Date;

public class Pessoa {

	private String nome;
	
	private Date data_nascimento;
	
	private Date data_nascimento2;
	
	private int idade;	

	public Date getData_nascimento2() {
		return data_nascimento2;
	}

	public void setData_nascimento2(Date data_nascimento2) {
		this.data_nascimento2 = data_nascimento2;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}	
	
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