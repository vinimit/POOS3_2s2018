package model;

public class Contato {
	private String nome;
    protected Telefone telefone;

    public Contato(String nome, int ddd, int numero) {
        this.nome = nome.toUpperCase();
        telefone = new Telefone(ddd, numero);
    }
    
    @Override
    public String toString() {
        return "Contato: " + nome + "  \t Telefone: " + telefone.toString();
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
}
