package model;

public class Operador extends Funcionario{

	
	public Operador(double salario, String nome) {
		super(salario, nome);
	}

	@Override
	public double getComissao() {
		return getSalario() * 5 / 100;
	}
}
