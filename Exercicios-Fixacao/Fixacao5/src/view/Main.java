package view;

import dao.UsuarioDao;
import model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		UsuarioDao dao = UsuarioDao.getInstance();
		
		dao.insert(new Usuario("ednilson", "Marisol", "123"));
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("pio", "Gustavo Pio", "987"));
		dao.insert(new Usuario("andre", "Andre da Silva", "987"));
		dao.insert(new Usuario("bruno", "Bruno da Cunha", "987"));
		dao.insert(new Usuario("facanobolso", "Jair Bolsonaro", "#elenão"));
		dao.insert(new Usuario("haddad", "Fernando Haddad", "13"));
		
		listaTodos();
		
		login("ednilson", "professornota10");
		login("ednilson", "123");
		
	}
	
	public static void listaTodos() {
		UsuarioDao dao = UsuarioDao.getInstance();
		for(int i=0; i<dao.getSize(); i++) {
			System.out.println(dao.recuperate(i).toString());
		}
	}
	
	public static void login(String username, String senha) {
		UsuarioDao dao = UsuarioDao.getInstance();
		Usuario verificar = dao.recuperate(dao.searchUsuarioPosition(username));
		if(verificar.autenticar(username, senha)) {
			System.out.println("Autenticado");
		}else {
			System.out.println("Erro no login");
		}
	}

}
