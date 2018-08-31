package model.fila;

import model.Cliente;

public interface IFilaComPrioridade extends IFila{

	public abstract Cliente saiFilaComPrioridade();
	
	public abstract int proximaSenha();
}
