package model.filaestatica;

import model.Cliente;
import model.fila.IFilaComPrioridade;

public class Fila implements IFilaComPrioridade{
	
	private final int DEFAULT_MAXIMO = 100;
	private Cliente[] fila;
	private int inicio;
	private int fim;
	private int tamanhoMaximo;
	
	public Fila() {
		tamanhoMaximo = DEFAULT_MAXIMO;
		init();
	}
	
	public Fila(int tamanhoMaximo) {
		if(tamanhoMaximo > 0) {
			this.tamanhoMaximo = tamanhoMaximo;
		}else {
			this.tamanhoMaximo = DEFAULT_MAXIMO;
		}
		init();
	}
	
	private void init() {
		fila = new Cliente[tamanhoMaximo];
		inicio = 0;
		fim = -1;
	}
	
	
	public int proximaSenha() {
		int i;
		if(estaVazia()) {
			i = 1;
		}else {
			i = fila[fim].getSenha() + 1;
		}
		return i;
	}

	@Override
	public boolean entraFila(Cliente c) {
		boolean deuCerto = false;
		if(c != null && !estaCheia()) {
			fim += 1;
			fila[fim] = c; 
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public Cliente saiFila() {
		Cliente c = null;
		if(!estaVazia()) {
			c = fila[inicio];
			inicio += 1;
		}
		return c;
	}

	@Override
	public boolean estaCheia() {
		return fim == tamanhoMaximo-1;
	}

	@Override
	public boolean estaVazia() {
		return fim < inicio;
	}

	@Override
	public Cliente saiFilaComPrioridade() {
		Cliente c = null;
		int i;
		if(!estaVazia()) {
			i = inicio;
			do {
				if(fila[i].isPrioritario()) {
					c = fila[i];
					inicio += 1;
					while(i > inicio-1) {
						fila[i] = fila[i-1];
						i -= 1;
					}
				}else {
					i++;
				}
			}while(c == null && i < tamanhoMaximo);
			if(c == null) {
				c = saiFila();
			}
		}
		return c;
	}
}
