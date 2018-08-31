package model.filaestatica;

import model.Cliente;

public class Fila {
	
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
	
	public boolean isEmpty() {
		return fim < inicio;
	}
	
	public boolean isFull() {
		return fim == tamanhoMaximo-1;
	}
	
	public boolean enqueue(Cliente c) {
		boolean deuCerto = false;
		if(c != null && !isFull()) {
			fim += 1;
			fila[fim] = c; 
			deuCerto = true;
		}
		return deuCerto;
	}
	
	public Cliente dequeue() {
		Cliente c = null;
		if(!isEmpty()) {
			c = fila[inicio];
			inicio += 1;
		}
		return c;
	}
	
	public Cliente dequeuePrioritario() {
		Cliente c = null;
		int i;
		if(!isEmpty()) {
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
				c = dequeue();
			}
		}
		return c;
	}
	
	public int proximaSenha() {
		int i;
		if(isEmpty()) {
			i = 1;
		}else {
			i = fila[fim].getSenha() + 1;
		}
		return i;
	}
}
