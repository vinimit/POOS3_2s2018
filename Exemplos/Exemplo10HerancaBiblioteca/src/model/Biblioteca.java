package model;


/**
 * Classe que permite o armazenamento de itens.
 *
 * @author ednilsonrossi
 */
public class Biblioteca {
    private static final int MAXIMO = 100;

    private Item[] itens;
    private int maximoItens;
    private int itensCadastrados;

    /**
     * Contrutor da biblioteca. Recebe a quantidade máxima de itens que podem ser armazenados
     * na biblioteca.
     * @param maximoItens
     */
    public Biblioteca(int maximoItens) {
        setMaximoItens(maximoItens);
        this.itensCadastrados = 0;
        itens = new Item[maximoItens];
    }

    /**
     * Constroi uma biblioteca com MAXIMO de livros. Máximo definido com 100.
     */
    public Biblioteca() {
        maximoItens = MAXIMO;
        itensCadastrados = 0;
        itens = new Item[maximoItens];
    }

    /**
     * Informa a quantidade máxima de itens que podem ser armazenados na biblioteca.
     * @return
     */
    public int getMaximoItens() {
        return maximoItens;
    }

    /**
     * Configura a quantidade máxima de itens da biblioteca. Essa configuração não pode ser
     * alterada em tempo de execução.
     * @param maximoItens
     */
    private void setMaximoItens(int maximoItens) {
        this.maximoItens = maximoItens>=1?maximoItens:1;
    }

    /**
     * Informa a quantidade de itens cadastrados na biblioteca.
     * @return
     */
    public int getItensCadastrados() {
        return itensCadastrados;
    }

    /**
     * Faz a inclusão de um novo item, independentemente de qual objeto no array.
     *
     * @param item
     * @return
     */
    private boolean novoItem(Item item){
        boolean deuCerto = false;
        if(!isFull() && item != null){
            itens[itensCadastrados] = item;
            itensCadastrados += 1;
            deuCerto = true;
        }
        return deuCerto;
    }

    /**
     * Informa se a biblioteca está cheia.
     * @return
     */
    public boolean isFull(){
        return itensCadastrados == maximoItens;
    }

    /**
     * Cadastra um Livro
     * @param livro
     * @return boolean indicando se deu certo ou não
     */
    public boolean cadastraLivro(Livro livro){
        return novoItem(livro);
    }

    /**
     * Cadastra Periódico
     * @param periodico
     * @return boolean indicando se deu certo ou não
     */
    public boolean cadastraPeriodico(Periodico periodico){
        return novoItem(periodico);
    }

    /**
     * Cadastra CD de Audio
     * @param audio
     * @return boolean indicando se deu certo ou não
     */
    public boolean cadastraAudio(Audio audio){
        return novoItem(audio);
    }

    /**
     * Cadastra CD de Dados
     * @param dado
     * @return boolean indicando se deu certo ou não
     */
    public boolean cadastraDado(Dado dado){
        return novoItem(dado);
    }

    /**
     * Cadastra VHS
     * @param vhs
     * @return boolean indicando se deu certo ou não
     */
    public boolean cadastraVHS(VHS vhs){
        return novoItem(vhs);
    }

    /**
     * Retorna um item cadastrado de acordo com a posição desejada.
     * @param posicao deve ser uma posição válida.
     * @return O item da posição
     */
    public Item getItemAt(int posicao){
        Item item = null;
        if(posicao >= 0 && posicao < itensCadastrados){
            item = itens[posicao];
        }
        return item;
    }

    /**
     * Retorna a quantidade de livros cadastrados na biblioteca.
     * @return
     */
    public int quantidadeLivros(){
        int i, conta;
        for(i=0, conta=0; i<itensCadastrados; i++){
            if(itens[i] instanceof Livro){
                conta++;
            }
        }
        return conta;
    }
}
