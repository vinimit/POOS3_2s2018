package model;

/**
 * Classe item é uma classe genérica que representa todos os itens de uma
 * biblioteca.
 *
 * @author ednilsonrossi
 */
public abstract class Item {

    private int id;
    private String descricao;

    /**
     * Contrutor de Item.
     *
     * O identificador <code>id</code> não é validado como único no sistema. Cabe ao usuário garantir
     * que o contrutor receba um <code>id</code> único.
     *
     * @param id identificar único do objeto
     * @param descricao descrição sucinta do item que será armazenado no sistema
     */
    public Item(int id, String descricao) {
        setId(id);
        setDescricao(descricao);
    }

    /**
     * Apresenta o objeto em formato String.
     *
     * @return String no formato: "ID: XXX      Descrição: XXXXXXX"
     */
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("ID: ");
        sb.append(id);
        sb.append("\t");
        sb.append("Descrição: ");
        sb.append(descricao);
        return sb.toString();
    }

    /**
     * Retorna o id do objeto.
     * @return <code>id</code> do objeto.
     */
    public int getId() {
        return id;
    }

    /**
     * Configura o <code>id</code> do objeto. São aceitos como ID valores inteiros positivos. Qualquer valor
     * negativo será convertido para o (zero).
     *
     * @param id valor inteiro positivo que representa o item como único
     */
    public void setId(int id) {
        this.id = id >= 0? id : 0;
    }

    /**
     * Retorna a descrição do item
     * @return descrição no formato String
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Configura a descrição do item. Todas as descrições são padronizadas com letra maiúscula.
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao.toUpperCase();
    }

    public String getDescritivo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Extrato do Objeto\n");
        sb.append("-------------------\n");
        sb.append("Objeto da classe: ");
        sb.append(getClass().getName());
        sb.append("\n\t");
        sb.append(toString());
        sb.append("\n-------------------\n");
        return sb.toString();
    }
}
