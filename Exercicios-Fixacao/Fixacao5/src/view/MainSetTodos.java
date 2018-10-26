package view;

import java.util.Iterator;
import java.util.Set;

import dao.UsuarioDaoSet;
import dao.UsuarioDaoSet2;
import dao.UsuarioDaoSetTodos;
import model.Usuario;

public class MainSetTodos {
	public static void main(String[] args) {		
		UsuarioDaoSetTodos dao = UsuarioDaoSetTodos.getInstance();
		
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("ednilso", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("pio", "Gustavo Pio", "987"));
		dao.insert(new Usuario("andre", "Andre da Silva", "987"));
		dao.insert(new Usuario("bruno", "Bruno da Cunha", "987"));
		dao.insert(new Usuario("facanobolso", "Jair Bolsonaro", "#elenão"));
		dao.insert(new Usuario("haddad", "Fernando Haddad", "13"));
		
		System.out.println(dao.getTodos());
	}
	
	
}
