package view;

import model.ArrayConjuntoGeneric;
import model.Nada;

public class Main {
	public static void main(String args[]) {
		ArrayConjuntoGeneric<Nada> arrayNadas;
		
		arrayNadas = new ArrayConjuntoGeneric<>();
		
		for(int i=0; i < 10; i++) {
			arrayNadas.add(new Nada());
		}
		
		while(!arrayNadas.isEmpty()) {
			System.out.println(arrayNadas.remove(0).toString());
		}
	}
}
