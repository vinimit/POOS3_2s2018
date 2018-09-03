package model.repositorios;

import model.produto.Produto;

public class ArquivoProdutos implements IRepositorioProduto{
	private final int DEFAULT_SIZE = 100; 
	private Produto[] products;
	private int maxSize;
	private int arraySize;
	
	public ArquivoProdutos() {
		this.maxSize = DEFAULT_SIZE;
		criar();
	}
	
	public ArquivoProdutos(int tamanhoMaximo) {
		super();
		this.maxSize = tamanhoMaximo > 1 ? tamanhoMaximo : DEFAULT_SIZE;
		criar();
	}

	private void criar() {
		this.products = new Produto[this.maxSize];
		this.arraySize = 0;
	}

	@Override
	public Produto buscarPosicao(int posicao) {
		Produto p = null;
		if(posicao >= 0 && posicao < arraySize) {
			p = products[posicao];
		}
		return p;
	}

	@Override
	public int tamanho() {
		return this.arraySize;
	}

	@Override
	public boolean estaCheio() {
		return arraySize == maxSize-1;
	}

	@Override
	public boolean adicionar(Produto p) {
		boolean deuCerto = false;
		if(p != null && !estaCheio()) {
			products[arraySize] = p;
			arraySize += 1;
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public Produto buscar(int codigo) {
		Produto p = null;
		for(int i=0; i<arraySize && p == null; i++) {
			if(products[i].getCodigo() == codigo) {
				p = products[i];
			}
		}
		return p;
	}

	private int recuperaPosicao(Produto p) {
		int posicao = -1;
		for(int i=0; i < arraySize && posicao == -1; i++) {
			if(products[i].equals(p)) {
				posicao = i;
			}
		}
		return posicao;
	}
	
	@Override
	public boolean deletar(Produto p) {
		boolean deuCerto = false;
		int posicao = recuperaPosicao(p);
		if(posicao != -1) {
			for(; posicao < arraySize-1; posicao++) {
				products[posicao] = products[posicao+1];
			}
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public boolean alterar(Produto p) {
		boolean deuCerto = false;
		int posicao = recuperaPosicao(p);
		if(posicao != -1) {
			products[posicao].setDescricao(p.getDescricao());
			products[posicao].setFornecedor(p.getFornecedor());
			products[posicao].setUnidade(p.getUnidade());
			deuCerto = true;
		}
		return deuCerto;
	}

	
	
}
