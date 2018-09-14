package model;

public class Objetiva extends Questao {
    public static final int TIPO_QUESTAO = 2;
    public static final int VERDADEIRO_FALSO = 2;
    public static final int MULTIPLA_ESCOLHA = 5;

    private int nroAlternativas;
    private String[] alternativas;
    private int alternativaCorreta;

    public Objetiva(String enunciado, float valor, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String alternativa5, int alternativaCorreta){
        super(enunciado, valor);
        this.nroAlternativas = MULTIPLA_ESCOLHA;
        this.alternativas = new String[]{alternativa1.toUpperCase(), alternativa2.toUpperCase(), alternativa3.toUpperCase(), alternativa4.toUpperCase(), alternativa5.toUpperCase()};
        this.alternativaCorreta
                = alternativaCorreta > 0 && alternativaCorreta <= 5?alternativaCorreta-1:0;

    }

    public Objetiva(String enunciado, float valor, String alternativa1, String alternativa2, int alternativaCorreta){
        super(enunciado, valor);
        this.nroAlternativas = VERDADEIRO_FALSO;
        this.alternativas = new String[]{alternativa1.toUpperCase(), alternativa2.toUpperCase()};
        this.alternativaCorreta = alternativaCorreta > 0 && alternativaCorreta <= 2?alternativaCorreta-1:0;
    }

    public boolean responder(int resposta){
        return resposta-1 == alternativaCorreta;
    }

    @Override
    public int tipoQuestao() {
        return TIPO_QUESTAO;
    }

    @Override
    public String apresentaQuestao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Questão Objetiva: \n");
        sb.append(getEnunciado());
        sb.append("\nValor: ");
        sb.append(getValor());
        sb.append(" pontos\n");
        sb.append("Alternativas: ");
        for(int i=0; i<nroAlternativas; i++){
            sb.append("\n\t");
            sb.append(i+1);
            sb.append(". ");
            sb.append(alternativas[i]);
        }
        //sb.append("\n----------------------------\n");
        return sb.toString();
    }

}
