package model;

/**
 * Classe que representa um CD de Audio.
 *
 * @author ednilsonrossi
 */
public class Audio extends CD {

    private int faixas;
    private int duracao;

    @Override
    public String imprimeCapa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ");
        sb.append(getDescricao());
        sb.append("\nGravadora: ");
        sb.append(getGravadora());
        sb.append("\nFaixas: ");
        sb.append(faixas);
        return sb.toString();
    }

    public Audio(int id, String descricao, String gravadora, int tipo, int faixas, int duracao) {
        super(id, descricao, gravadora, tipo);
        setFaixas(faixas);
        setDuracao(duracao);
    }

    /**
     * Informa a quantidade de faixas do CD de audio.
     * @return
     */
    public int getFaixas() {
        return faixas;
    }

    /**
     * Configura a quantidade de faixas de um CD. Considera o mínimo de 1 faixa.
     * @param faixas
     */
    public void setFaixas(int faixas) {
        this.faixas = faixas>=1?faixas:1;
    }

    /**
     * Informa a duração de um CD em minitos.
     * @return
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * Configura a duração de um CD em minutos. Duração mínima de 1 minuto.
     * @param duracao
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao>=1?duracao:1;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n Faixas: ");
        sb.append(faixas);
        sb.append("\tDuração: ");
        sb.append(duracao);
        sb.append(" minutos");
        return sb.toString();
    }
}
