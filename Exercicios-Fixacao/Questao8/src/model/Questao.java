package model;


/**
 * Classe modelo para uma questão.
 *
 * @author ednilsonrossi
 */
public abstract class Questao {

    private String enunciado;
    private float valor;

    /**
     * Constroi uma classe Questao com um enunciado e o valor da questão.
     * @param enunciado
     * @param valor considera valores acima de 1.0, caso seja informado um valor inválido será atribuído 1.
     */
    public Questao(String enunciado, float valor) {
        setEnunciado(enunciado);
        setValor(valor);
    }

    /**
     * Retorna o enunciado da questão
     * @return
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * Configura o enunciado da questão. Converte-se o texto para maiúsculo.
     * @param enunciado
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado.toUpperCase();
    }

    /**
     * Retorna o valor da questão.
     * @return
     */
    public float getValor() {
        return valor;
    }

    /**
     * Configura o valor da questão. Aceita-se valores iguais ou maiores que 1.
     * Caso o valor informado seja menor que 1 será configurado para o valor 1.
     * @param valor
     */
    public void setValor(float valor) {
        this.valor = valor >= 1? valor : 1;
    }

    public abstract int tipoQuestao();

    public abstract String apresentaQuestao();
}
