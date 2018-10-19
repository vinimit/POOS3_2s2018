package view;

import model.Estudante;

public class Main2 {
	public static void main(String args[]) {
		Estudante estudante;
        estudante = new Estudante(123, "Ednilson");
        estudante.addNota(5, 15);
        estudante.addNota(10, 5);
        estudante.addNota(3, 80);
        System.out.println(estudante.media());
	}
}
