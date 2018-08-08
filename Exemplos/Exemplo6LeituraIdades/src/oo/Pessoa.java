package oo;

public class Pessoa {
	private int idade;

    public Pessoa(int idade) {
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade >= 0 ? idade : 0 ;
    }
}
