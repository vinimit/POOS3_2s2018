package model;

public class Aluno {
	private static int quantidade = 0;
	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
		Aluno.quantidade += 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static int getQuantidadeInstancias() {
		return quantidade;
	}
}
