package model;

public class Nota {
	
	private double nota;
	private double porcentagem;
	
	public Nota(double nota, double porcentagem) {
		super();
		this.nota = nota;
		this.porcentagem = porcentagem;
	}
	
	public double parcial(){
        return nota * (porcentagem/100.0);
    }
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
}
