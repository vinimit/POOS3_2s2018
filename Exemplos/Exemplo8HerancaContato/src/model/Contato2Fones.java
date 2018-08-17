package model;

public class Contato2Fones extends Contato{
	
	private Telefone fone2;

	public Contato2Fones(String nome, int ddd, int numero, int ddd2, int numero2) {
		super(nome, ddd, numero);
		fone2 = new Telefone(ddd2, numero2);
	}
	
	public Contato2Fones(String nome, int ddd, int numero) {
		super(nome, ddd, numero);
		fone2 = new Telefone(0, 0);
	}
/*
	@Override
	public String toString() {
		String texto = super.toString();
		texto += "\t Telefone: " + this.fone2.toString();
		return texto;
	}
*/
	public Telefone getFone2() {
		return fone2;
	}

	public void setFone2(Telefone fone2) {
		this.fone2 = fone2;
	}
}
