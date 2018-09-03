package model.repositorios;

import model.produto.Produto;

public interface IRepositorioProduto {
	
	public abstract boolean adicionar(Produto p);
	
	public abstract Produto buscar(int codigo);
	
	public abstract Produto buscarPosicao(int posicao);
	
	public abstract boolean deletar(Produto p);
	
	public abstract boolean alterar(Produto p);
	
	public abstract int tamanho();
	
	public abstract boolean estaCheio();
}
