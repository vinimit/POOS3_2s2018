package model;

public class Gerente extends Funcionario{

	public Gerente(double salario, String nome) {
		super(salario, nome);
	}
	
	@Override
	public double getComissao() {
		return getSalario() * 15 / 100;
	}
}
