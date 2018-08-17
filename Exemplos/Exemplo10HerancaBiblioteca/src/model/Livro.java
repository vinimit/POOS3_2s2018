package model;

/**
 * Classe que representa um livro.
 *
 * @see model.Item
 * @author ednilsonrossi
 */

public class Livro extends Item {

    private String autor;

    /**
     * Construtor da e livro.
     *
     * @param id
     * @param descricao
     * @param autor
     */
    public Livro(int id, String descricao, String autor) {
        super(id, descricao);
        this.autor = autor;
    }

    /**
     * Retorna o autor do livro.
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Configura o autor do livro. Nome do autor armazenado em letra maiíscula.
     *
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor.toUpperCase();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append("\n");
        sb.append("Autor do livro: ");
        sb.append(autor);
        return sb.toString();
    }
}

