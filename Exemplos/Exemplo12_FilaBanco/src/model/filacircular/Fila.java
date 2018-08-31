package model.filacircular;

import model.Cliente;
import model.fila.IFila;
import model.fila.IFilaComPrioridade;

public class Fila implements IFilaComPrioridade{
	private final int DEFAULT_TAMANHO_MAXIMO = 100;
	private Cliente filaCircular[];
	private int inicio;
	private int fim;
	private int tamanhoAtual;
	private int tamanhoMaximo;
	
	public Fila() {
		tamanhoMaximo = DEFAULT_TAMANHO_MAXIMO;
		criarFila();
	}
	
	public Fila(int tamanhoDesejado) {
		this.tamanhoMaximo = tamanhoDesejado > 0 ? tamanhoDesejado : DEFAULT_TAMANHO_MAXIMO;
		criarFila();
	}
	
	private void criarFila() {
		filaCircular = new Cliente[tamanhoMaximo];
		inicio = 0;
		fim = 0;
		tamanhoAtual = 0;
	}
	
	@Override
	public boolean estaCheia() {
		return tamanhoAtual == tamanhoMaximo;
	}
	
	@Override
	public boolean estaVazia() {
		return tamanhoAtual == 0;
	}

	@Override
	public boolean entraFila(Cliente c) {
		boolean deuCerto = false;
		if(c != null && !estaCheia()) {
			filaCircular[fim] = c;
			if(fim == tamanhoMaximo-1) {
				fim = 0;
			}else {
				fim += 1;
			}
			tamanhoAtual += 1;
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public Cliente saiFila() {
		Cliente c = null;
		if(!estaVazia()) {
			c = filaCircular[inicio];
			inicio = inicio == tamanhoMaximo-1 ? 0 : inicio + 1;
			tamanhoAtual -= 1;
		}
		return c;
	}

	@Override
	public Cliente saiFilaComPrioridade() {
		Cliente c = null;
		
		boolean achou;
		Fila auxiliar = new Fila(this.tamanhoAtual);
		
		if(!estaVazia()) {
			achou = false;
			while(!this.estaVazia() && !achou) {
				c = saiFila();
				if(c.isPrioritario()) {
					achou = true;
				}else {
					auxiliar.entraFila(c);
				}
			}
			while(!this.estaVazia()) {
				auxiliar.entraFila(this.saiFila());
			}
			while(!auxiliar.estaVazia()) {
				this.entraFila(auxiliar.saiFila());
			}
			if(!achou) {
				c = this.saiFila();
			}
		}
		return c;

	}

	@Override
	public int proximaSenha() {
		int i;
		if(estaVazia()) {
			i = 1;
		}else {
			i = filaCircular[fim-1].getSenha() + 1;
		}
		return i;
	}
}
///