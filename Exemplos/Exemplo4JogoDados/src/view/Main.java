package view;

import javax.swing.JOptionPane;

import model.Dado;

public class Main {

	public static void main(String[] args) {
		Dado dado1, dado2;
		int i;
		int rodada, total;
		
		dado1 = new Dado();
		dado2 = new Dado();
		
		rodada = 0;
		total = 0;
		for(i=1; i<=3; i++) {
			dado1.jogar();
			dado2.jogar();
			
			rodada = dado1.getFace() + dado2.getFace();
			total += rodada;
			JOptionPane.showMessageDialog(null, "Somado dos dados: " + rodada, "Rodada " + i, JOptionPane.INFORMATION_MESSAGE);
		}
		
		JOptionPane.showMessageDialog(null, "Total de todas rodadas: " + total, "Dados de POO", JOptionPane.INFORMATION_MESSAGE);
	}

}
