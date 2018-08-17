package model;

/**
 * Classe que representa um VHS
 */
public class VHS extends Midia{
    private int duracao;

    public VHS(int id, String descricao, String gravadora, int duracao) {
        super(id, descricao, gravadora);
        setDuracao(duracao);
    }

    /**
     * Informa a duração em minutos.
     * @return
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * Configura a duração em minutos. Mínimo 1 minuto.
     * @param duracao
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao>=1?duracao:1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nDuração: ");
        sb.append(duracao);
        sb.append(" minutos.");
        return sb.toString();
    }
}
