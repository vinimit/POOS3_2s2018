package view;

import model.ArrayConjuntoGeneric;

public class Main2 {

	public static void main(String[] args) {
		
		ArrayConjuntoGeneric<String> mensagens = new ArrayConjuntoGeneric<>(10);
		
		for(int i=0; i < 100; i++ ) {
			mensagens.add("Nada a declarar em " + i);
		}

		while(!mensagens.isEmpty()) {
			System.out.println(mensagens.remove(0));
		}
	}
}
