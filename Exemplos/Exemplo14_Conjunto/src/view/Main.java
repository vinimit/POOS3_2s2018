package view;

import model.Agenda;
import model.Contato;
import model.Telefone;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Contato contato;
		
		agenda.insereContato(new Contato("Ednilson", "ednilsonrossi@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Ednilson", "ednilsonrossi@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Ednilson", "ednilsonrossi@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Ednilson", "ednilsonrossi@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Ednilson", "ednilsonrossi@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		
		contato = new Contato("Lucca", "lucca@aluno.ifsp.edu.br", new Telefone(16, 3303, 2330));
		contato.novoTelefone(new Telefone(16, 9999, 1234));
		contato.novoTelefone(new Telefone(16, 99701, 4321));
		agenda.insereContato(contato);
		

		System.out.println(agenda.listaContatos());
		
		
	}

}
