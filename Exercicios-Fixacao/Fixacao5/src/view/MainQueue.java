package view;


import dao.UsuarioDaoQueue;

import model.Usuario;

public class MainQueue {
	public static void main(String[] args) {		
		UsuarioDaoQueue dao = UsuarioDaoQueue.getInstance();
		
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("pio", "Gustavo Pio", "987"));
		dao.insert(new Usuario("andre", "Andre da Silva", "987"));
		dao.insert(new Usuario("bruno", "Bruno da Cunha", "987"));
		dao.insert(new Usuario("facanobolso", "Jair Bolsonaro", "#elenão"));
		dao.insert(new Usuario("haddad", "Fernando Haddad", "13"));
		
		System.out.println(dao.getAll());
	}
	
	
}
