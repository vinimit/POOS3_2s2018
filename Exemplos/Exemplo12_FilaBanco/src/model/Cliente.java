package model;

public class Cliente {
	private int senha;
	private boolean prioritario;
	
	public Cliente(int senha, boolean prioritario) {
		setSenha(senha);
		this.prioritario = prioritario;
	}
	
	private void setSenha(int senha) {
		this.senha = senha < 1 ? 1 : senha;
	}

	public boolean isPrioritario() {
		return prioritario;
	}

	public void setPrioritario(boolean prioritario) {
		this.prioritario = prioritario;
	}

	public int getSenha() {
		return senha;
	}
	
	
}
