package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Cliente;
import model.filaestatica.Fila;

public class Caixa extends JFrame{
	
	private JPanel painel;
	private JButton botao;
	private JLabel senha;
	
	private Fila fila;
	private boolean prioritario;
	
	
	public Caixa(Fila fila, boolean prioritario) {
		criarComponentes();
		this.fila = fila;
		this.prioritario = prioritario;
		ajuste();
		
	}
	
	private void criarComponentes() {
		painel = new JPanel();
		senha = new JLabel("Chame o próximo cliente");	
		botao = new JButton("Chamar Próximo");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chamarProximo();
			}
		});
		
		painel.add(senha);
		painel.add(botao);
		add(painel);
	}
	
	private void ajuste() {
		setVisible(true);
		if(prioritario) {
			setTitle("Caixa Prioritário");
		}else {
			setTitle("Caixa Normal");
		}
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private void chamarProximo() {
		Cliente c;
		if(prioritario) {
			c = fila.dequeuePrioritario();
		}else {
			c = fila.dequeue();
		}
		if(c != null)
			senha.setText("Próximo: " + c.getSenha());
		else
			senha.setText("Fila vazia");
	}
}
