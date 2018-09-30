package model;

public class Agenda {
	private ArrayConjunto contatos;
	
	
	public Agenda() {
		contatos = new ArrayConjunto();
	}
	
	public boolean insereContato(Contato contato) {
		return contatos.add(contato);
	}
	
	public String listaContatos() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<contatos.size(); i++) {
			sb.append("-----------\n");
			sb.append(contatos.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
