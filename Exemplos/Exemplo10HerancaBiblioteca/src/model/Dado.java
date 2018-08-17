package model;

/**
 * Classe que representa um CD de Dados.
 *
 * @author ednilsonrossi
 */
public class Dado extends CD {
    private int tamanho;

    public Dado(int id, String descricao, String gravadora, int tipo, int tamanho) {
        super(id, descricao, gravadora, tipo);
        setTamanho(tamanho);
    }

    @Override
    public String imprimeCapa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ");
        sb.append(getDescricao());
        sb.append("\nGravadora: ");
        sb.append(getGravadora());
        sb.append("\nTamanho: ");
        sb.append(tamanho);
        sb.append(" MB");
        return sb.toString();
    }

    /**
     * /informa o tamanho de um CD de dados em Megabytes
     * @return <code>tamanho</code> em Megabytes
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Configura o tamanho em Megabytes de um Cd de dados. Considera como mínimo 1 MB.
     * @param tamanho em megabytes
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho>=1?tamanho:1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nTamanho: ");
        sb.append(tamanho);
        sb.append(" MB");
        return sb.toString();
    }
}
