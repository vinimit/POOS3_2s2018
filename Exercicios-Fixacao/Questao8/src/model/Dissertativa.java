package model;

public class Dissertativa extends Questao{

    public static final int TIPO_QUESTAO = 1;

    private String respostaCorreta;

    public Dissertativa(String enunciado, float valor, String respostaCorreta) {
        super(enunciado, valor);
        this.respostaCorreta = respostaCorreta.toUpperCase();
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    @Override
    public int tipoQuestao() {
        return TIPO_QUESTAO;
    }

    @Override
    public String apresentaQuestao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Questão Dissertativa: \n");
        sb.append(getEnunciado());
        sb.append("\nValor: ");
        sb.append(getValor());
        sb.append(" pontos\n");
        //sb.append("----------------------------\n");
        return sb.toString();
    }


}
