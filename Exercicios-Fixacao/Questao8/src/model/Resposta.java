package model;

public class Resposta {
    private Questao questao;
    private String respostaDissertativa;
    private boolean correta;

    public Resposta(Objetiva questao, int respostaAlternativa) {
        correta = questao.responder(respostaAlternativa);
        this.questao = questao;
    }

    public Resposta(Dissertativa questao, String respostaDissertativa) {
        this.questao = questao;
        this.respostaDissertativa = respostaDissertativa;
        correta = false;
    }

    public int getTipoQuestao(){
        int retorno=0;
        if(questao != null){
            retorno = questao.tipoQuestao();
        }
        return retorno;
    }

    public String corrigirDissertativa(){
        Dissertativa dissertativa;
        String txt;
        if(this.questao instanceof Dissertativa) {
            dissertativa = (Dissertativa) questao;
            StringBuilder sb = new StringBuilder();
            sb.append("RESPOSTA DA QUESTÃO:\n");
            sb.append(dissertativa.getRespostaCorreta());
            sb.append("\n--------------------------\n");
            sb.append("RESPOSTA DO ALUNO: \n");
            sb.append(this.respostaDissertativa);
            sb.append("\n--------------------------\n");
            txt = sb.toString();
        }else{
            txt = "QUESTÃO NÃO É DISSERTATIVA.";
        }
        return txt;
    }

    public void corrigirDissertativa(boolean resposta){
        this.correta = resposta;
    }

    public boolean isCorreta(){
        return correta;
    }
}
