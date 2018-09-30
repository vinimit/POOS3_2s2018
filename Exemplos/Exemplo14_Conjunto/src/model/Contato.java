package model;

public class Contato implements ICoisa{

	private String nome;
	private String email;
	private ArrayConjunto telefones;
	
	public Contato(String nome, String email, Telefone telefone) {
		setEmail(email);
		setNome(nome);
		telefones = new ArrayConjunto(2);
		telefones.add(telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
	
	public boolean novoTelefone(Telefone telefone) {
		return telefones.add(telefone);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome: ");
		sb.append(getNome().toUpperCase());
		sb.append("\nE-mail: ");
		sb.append(getEmail());
		sb.append("\nTelefones: ");
		for(int i=0; i<telefones.size(); i++) {
			sb.append(telefones.get(i).toString());
			if(i+1 < telefones.size()) {
				sb.append(" | ");
			}
		}
		return sb.toString();
	}
	
}
