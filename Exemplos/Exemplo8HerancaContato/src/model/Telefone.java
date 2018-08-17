package model;

public class Telefone {
	private int ddd;
	private int numero;
	
	public Telefone(int ddd, int numero) {
		setDdd(ddd);
		setNumero(numero);
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		if(ddd > 10 && ddd < 100)
			this.ddd = ddd;
		else
			this.ddd = 11;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero > 10000000 && numero <= 999999999)
			this.numero = numero;
		else
			this.numero = 999990000;
	}

	@Override
	public String toString() {
		String saida = "(0" + this.ddd + ") " + this.numero; 
		return saida;
	}
	
	
}
