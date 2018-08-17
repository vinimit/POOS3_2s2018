package model;


/**
 * Classe que representa um periódico.
 *
 * @see model.Item
 * @author ednilsonrossi
 */
public class Periodico extends Item {

    private int anoPublicacao;
    private int volume;

    public Periodico(int id, String descricao, int anoPublicacao, int volume) {
        super(id, descricao);
        setAnoPublicacao(anoPublicacao);
        setVolume(volume);
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * Configura o ano de publicação do periódico. São aceitos anos a partir de 1900, anos anteriores
     * são configurados com 1900.
     *
     * @param anoPublicacao ano de publicação maior ou igual a 1900.
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao > 1900 ? anoPublicacao:1900;
    }

    public int getVolume() {
        return volume;
    }

    /**
     * Configura co volume. Volumes menores ou iguais a zero são considerados como 1.
     * @param volume
     */
    public void setVolume(int volume) {
        this.volume = volume>0?volume:1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nAno de publicação: ");
        sb.append(anoPublicacao);
        sb.append("\tVolume: ");
        sb.append(volume);
        return sb.toString();
    }
}
