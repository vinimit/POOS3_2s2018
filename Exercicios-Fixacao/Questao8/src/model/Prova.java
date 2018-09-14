package model;

public class Prova {
    private int qtdadeQuestoes;
    private int questoesCadastradas;
    private Questao questoes[];
    private Resposta respostas[];
    private boolean estaPronta;
    private boolean estaRespondida;

    public Prova(int qtdadeQuestoes) {
        this.qtdadeQuestoes = qtdadeQuestoes>0?qtdadeQuestoes:1;
        questoes = new Questao[this.qtdadeQuestoes];
        respostas = new Resposta[this.qtdadeQuestoes];
        for (int i=0; i<qtdadeQuestoes; i++){
            respostas[i] = null;
        }
        estaPronta = false;
        estaRespondida = false;
        questoesCadastradas = 0;
    }

    public boolean isEstaPronta() {
        return estaPronta;
    }

    public boolean isEstaRespondida() {
        return estaRespondida;
    }

    public int getQtdadeQuestoes() {
        return qtdadeQuestoes;
    }

    public Questao getQuestaoAt(int numeroQuestao) {
        Questao retorno = null;
        if(numeroQuestao >= 1 && numeroQuestao <= qtdadeQuestoes){
            retorno = questoes[numeroQuestao-1];
        }
        return retorno;
    }

    public Resposta getRespostaAt(int numeroQuestao) {
        Resposta retorno = null;
        if(numeroQuestao >= 1 && numeroQuestao <= qtdadeQuestoes){
            retorno = respostas[numeroQuestao-1];
        }
        return retorno;
    }

    public boolean novaQuestao(Questao questao){
        boolean deuCerto = false;
        if(!estaPronta){
            questoes[questoesCadastradas] = questao;
            questoesCadastradas ++;
            if(questoesCadastradas == qtdadeQuestoes){
                estaPronta = true;
            }
            deuCerto = true;
        }
        return deuCerto;
    }

    public boolean novaResposta(int numeroQuestao, Resposta resposta){
        boolean deuCerto = false;
        if(estaPronta && !estaRespondida){
            numeroQuestao--;
            if(questoes[numeroQuestao].tipoQuestao() == resposta.getTipoQuestao() && respostas[numeroQuestao] == null){
                respostas[numeroQuestao] = resposta;
                foiRespondida();
            }
        }
        return deuCerto;
    }

    private void foiRespondida(){
        boolean respondida = true;
        for(int i=0; i<qtdadeQuestoes && respondida; i++){
            if(respostas[i] == null){
                respondida = false;
            }
        }
        estaRespondida = respondida;
    }

    public float pontuacaoTotal(){
        float pontos = 0;
        if(estaRespondida){
            for(int i=0; i<qtdadeQuestoes; i++){
                if(respostas[i].isCorreta()){
                    pontos += questoes[i].getValor();
                }
            }
        }
        return pontos;
    }
}
