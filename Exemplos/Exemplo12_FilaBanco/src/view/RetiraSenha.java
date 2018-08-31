package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Cliente;
import model.filaestatica.Fila;

public class RetiraSenha extends JFrame{
	
	private JPanel painel;
	private JLabel senha;
	private JButton normal;
	private JButton prioridade;
	
	private Fila fila;
	
	public RetiraSenha(Fila fila) {
		criarComponentes();
		this.fila = fila;
		ajustes();
	}
	
	private void criarComponentes() {
		painel = new JPanel();
		
		senha = new JLabel("Senha: ");
		
		normal = new JButton("Normal");
		normal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gerarSenha(false);
			}
		});
		
		prioridade = new JButton("Prioritário");
		prioridade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gerarSenha(true);
			}
		});
		
		painel.add(senha);
		painel.add(normal);
		painel.add(prioridade);
		add(painel);
	}
	
	private void ajustes() {
		setVisible(true);
		setTitle("Retirada de senha");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private void gerarSenha(boolean prioridade) {
		Cliente c = new Cliente(fila.proximaSenha(), prioridade);
        
		if(fila.enqueue(c))
			senha.setText(String.valueOf(c.getSenha()));
		else 
			senha.setText("Senha não gerada");
		
        
	}
}
