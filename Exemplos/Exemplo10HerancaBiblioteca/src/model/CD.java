package model;

/**
 * Classe que representa um CD.
 *
 * @author ednilsonrossi
 * @see model.Midia
 * @see model.Item
 */
public abstract class CD extends Midia{
    public static final int TIPO_CDROM = 1;
    public static final int TIPO_DVD = 2;

    private int tipo;

    /**
     * Método abstrato que imprime as informações da capa do CD.
     *
     * @return String com Descrição e Gravadora.
     */
    public abstract String imprimeCapa();

    public CD(int id, String descricao, String gravadora, int tipo) {
        super(id, descricao, gravadora);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    /**
     * Configura o tipo de mídia. O padrão é CDROM.
     * @param tipo
     */
    public void setTipo(int tipo) {
        if(tipo == TIPO_CDROM || tipo == TIPO_DVD)
            this.tipo = tipo;
        else
            this.tipo = TIPO_CDROM;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if(tipo == TIPO_CDROM)
            sb.append("\nTipo: CDROM");
        else
            sb.append("\nTipo: DVD");
        return sb.toString();
    }
}
