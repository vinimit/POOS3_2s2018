package model;

/**
 * Classe que representa uma Mídia
 *
 * @see model.Item
 * @author ednilsonrossi
 */
public abstract class Midia extends Item {
    private String gravadora;

    public Midia(int id, String descricao, String gravadora) {
        super(id, descricao);
        this.gravadora = gravadora.toUpperCase();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nGravadora: ");
        sb.append(gravadora);
        return sb.toString();
    }

    public String getGravadora() {
        return gravadora;
    }

    /**
     * Configura a gravadora. Armazenado como maiúsculo
     * @param gravadora
     */
    public void setGravadora(String gravadora) {
        this.gravadora = gravadora.toUpperCase();
    }

}
