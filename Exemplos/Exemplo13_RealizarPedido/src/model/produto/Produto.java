package model.produto;

import model.Unidade;

public class Produto {
	private static int ultimoCodigo = 0;
	private int codigo;
	private String descricao;
	private String fornecedor;
	private Unidade unidade;
	
	public Produto(String descricao, String fornecedor, Unidade unidade) {
		super();
		this.setCodigo();
		this.setDescricao(descricao);
		this.setFornecedor(fornecedor);
		this.setUnidade(unidade);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	private void setCodigo() {
		this.codigo = ++ultimoCodigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	
	public String getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor.toUpperCase();
	}
	
	public Unidade getUnidade() {
		return unidade;
	}
	
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	@Override
	public boolean equals(Object obj) {
		Produto outro = (Produto) obj;
		return this.getCodigo() == outro.getCodigo();
	}
	
	
}
