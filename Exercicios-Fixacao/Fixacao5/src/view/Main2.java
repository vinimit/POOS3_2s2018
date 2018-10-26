package view;

import java.util.Iterator;
import java.util.Set;

import dao.UsuarioDaoSet;
import model.Usuario;

public class Main2 {
	public static void main(String[] args) {		
		UsuarioDaoSet dao = UsuarioDaoSet.getInstance();
		
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("ednilson", "Ednilson Rossi", "123"));
		dao.insert(new Usuario("pio", "Gustavo Pio", "987"));
		dao.insert(new Usuario("andre", "Andre da Silva", "987"));
		dao.insert(new Usuario("bruno", "Bruno da Cunha", "987"));
		dao.insert(new Usuario("facanobolso", "Jair Bolsonaro", "#elenão"));
		dao.insert(new Usuario("haddad", "Fernando Haddad", "13"));
		
		listaTodos();
	}
	
	public static void listaTodos() {
		UsuarioDaoSet dao = UsuarioDaoSet.getInstance();
		Set<Usuario> dadosSet = dao.retornaTodos();
		Iterator<Usuario> iterator = dadosSet.iterator();
		while(iterator.hasNext()) {
			Usuario u = iterator.next();
			System.out.println(u.toString());
		}
	}
	
	public static void login(String username, String senha) {
		UsuarioDaoSet dao = UsuarioDaoSet.getInstance();
		Usuario verificar = dao.recuperate(username);
		if(verificar.autenticar(username, senha)) {
			System.out.println("Autenticado");
		}else {
			System.out.println("Erro no login");
		}
	}
	
}
