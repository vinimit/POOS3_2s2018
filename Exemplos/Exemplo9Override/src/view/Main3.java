package view;

import model.Funcionario;
import model.Gerente;
import model.Operador;

public class Main3 {

	public static void main(String[] args) {
		Funcionario[] funcs = new Funcionario[5];
		
		funcs[0] = new Gerente(1000, "Cerebro");
		funcs[1] = new Operador(1000, "Pink");
		funcs[2] = new Operador(500, "Tom");
		funcs[3] = new Operador(500, "Jerry");
		funcs[4] = new Funcionario(500, "Garfield");
		
		for(int i=0; i<5; i++) {
			System.out.println("Funcionario: " + funcs[i].getNome() + " \tcomissão: " + funcs[i].getComissao());
		}
	}
}
