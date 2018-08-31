package view;

import model.fila.IFilaComPrioridade;
import model.filaestatica.Fila;


public class Main {
	
	
	public static void main(String args[]) {
	
		IFilaComPrioridade fila = new Fila(10);
		
		Caixa cx1 = new Caixa(fila, false);
		Caixa cx2 = new Caixa(fila, false);
		Caixa cx3 = new Caixa(fila, false);
		Caixa cx4 = new Caixa(fila, true);
		
		RetiraSenha senha = new RetiraSenha(fila);
	}
}
