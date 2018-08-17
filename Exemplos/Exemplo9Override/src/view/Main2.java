package view;

import model.Funcionario;
import model.Gerente;
import model.Operador;

public class Main2 {

	public static void main(String[] args) {
		
		Funcionario f1, f2, f3, f4, f5;
		
		f1 = new Gerente(1000, "Cerebro");
		f2 = new Operador(1000, "Pink");
		f3 = new Operador(500, "Tom");
		f4 = new Operador(500, "Jerry");
		f5 = new Funcionario(500, "Garfield");
		
		System.out.println("Funcionario: " + f1.getNome() + " \tcomissão: " + f1.getComissao());
		System.out.println("Funcionario: " + f2.getNome() + " \tcomissão: " + f2.getComissao());
		System.out.println("Funcionario: " + f3.getNome() + " \tcomissão: " + f3.getComissao());
		System.out.println("Funcionario: " + f4.getNome() + " \tcomissão: " + f4.getComissao());
		System.out.println("Funcionario: " + f5.getNome() + " \tcomissão: " + f5.getComissao());
	}
}
