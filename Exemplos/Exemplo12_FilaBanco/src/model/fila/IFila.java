package model.fila;

import model.Cliente;

public interface IFila {

	public abstract boolean entraFila(Cliente c);
	
	public abstract Cliente saiFila();
	
	public abstract boolean estaCheia();
	
	public abstract boolean estaVazia();
}
