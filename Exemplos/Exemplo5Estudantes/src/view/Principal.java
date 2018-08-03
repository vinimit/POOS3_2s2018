package view;

import model.Aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno gustavo;
		Aluno iago;
		Aluno gasparzinho;
		
		gustavo = new Aluno("Gustavo Pio");
		gustavo = new Aluno("Gustavo F.");
		iago = new Aluno("Iago");
		System.out.println("Alunos instanciados: " + Aluno.getQuantidadeInstancias());
		
		for(int i=0; i < 20; i++) {
			gasparzinho = new Aluno("Jhonatan");
		}
		System.out.println("Alunos instanciados: " + Aluno.getQuantidadeInstancias());
	}
}
