package model;

import java.util.Random;

public class JogoAdivinha {

    /**
     * Constante que indica que acabaram-se os palpites do usu&aacute;rio.
     */
	public static final int ACABOU_PALPITES = 0;
	
    /**
     * Constante que indica que o usu&aacute;rio acertou o palpite.
     */
    public static final int ACERTOU = 1;

    /**
     * Constante que indica que o n&uacute;mero sorteado &eacute; maior que o palpite.
     */
    public static final int PARA_CIMA = 2;
    
    /**
     * Constante que indica que o n&uacute;mero sorteado &eacute; menor que o palpite.
     */
    public static final int PARA_BAIXO = -1;

    private final int DEFAULT_MAX_RANGE = 60;
    private final int DEFAULT_MAX_PALPITES = 2;
    private int sorteado;
    private int maximoPalpites;
    private int palpitesDados;


    /**
     * Construtor que recebe o valor m&aacute;ximo do intervalo para sortear um n&uacute;mero. O intervalo
     * inicia-se em 0 e termina no valor informado pelo construtor.
     * Por exemplo, se o usu&aacute;rio informar o <code>maxRange</code> como 10 (dez) ser&aacute; sorteado
     * um n&uacute;mero entre 0 e 10.
     *
     * Caso seja informado um valor inv&aacute;lido ser&aacute; definido o <code>DEFAULT_MAX_RANGE</code> como
     * valor para m&aacute;ximo a ser sorteado.
     *
     * @param maxRange &eacute; o valor m&aacute;ximo do intervalo que ser&aacute; gerado.
     */
    public JogoAdivinha(int maxRange) {
        sortear(maxRange);
        maximoPalpites = DEFAULT_MAX_PALPITES;
        palpitesDados = 0;
    }

    /*
    public JogoAdivinha(int maxRange, int qtdTentativas) {
        sortear(maxRange);
        qtdTentativas = Math.abs(qtdTentativas);
        maximoPalpites = qtdTentativas == 0 ? DEFAULT_MAX_PALPITES : qtdTentativas;
        palpitesDados = 0;
    }
    */


    private void sortear(int maxRange){
        Random rand = new Random();
        maxRange = Math.abs(maxRange);
        sorteado = maxRange > 0 ? rand.nextInt(maxRange+1) : rand.nextInt(DEFAULT_MAX_RANGE);
    }

    private boolean podePalpitar(){
        return palpitesDados <= maximoPalpites;
    }

    /**
     * M&eacute;todo que permite um palpite. O usu&aacute;rio informa o palpite e o m&eacute;todo verifica se ele acertou ou n&atilde;o.
     * Caso n&atilde;o tenha acetado uma dica &eacute; dada ao usu&aacute;rio. A dica <code>PARA_CIMA</code> indica que o valor sorteado
     * &eacute; maior que o palpite dado pelo usu&aacute;rio. A dica <code>PARA_BAIXO</code> indica que o valor sorteado
     * &eacute; menor que o palpite dado pelo usu&aacute;rio.
     *
     * @param palpite valor informado pelo usu&aacute;rio que ser&aacute; comparado com o valor sorteado.
     *
     * @return 
     * <code>ACABOU_PALPITES</code> caso o usu&acute;rio não possa mais palpitar.
     * <code>ACERTOU</code> caso o palpite seja o n&uacute;mero sorteado.
     * <code>PARA_BAIXO</code> caso o palpite seja maior que o n&uacute;mero sorteado.
     * <code>PARA_CIMA</code> caso o plapite seja menor que n&uacute;mero sorteado.
     */
    public int palpitar(int palpite){
        int retorno = ACABOU_PALPITES;
        if(podePalpitar()) {
            if (sorteado == palpite)
                retorno = ACERTOU;
            else if (sorteado > palpite)
                retorno = PARA_CIMA;
            else
                retorno = PARA_BAIXO;
        }
        return retorno;
    }
	
}
