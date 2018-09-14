package view;

import jdk.nashorn.internal.scripts.JO;
import model.Dissertativa;
import model.Objetiva;
import model.Prova;
import model.Resposta;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Prova avaliacao;
        String resposta;
        int questao;

        JOptionPane.showMessageDialog(null, "Criar uma prova");
        avaliacao = new Prova(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de questões da prova")));

        do{
            switch (JOptionPane.showConfirmDialog(null, "Questão de multipla escolha?", "Cadastro de prova", JOptionPane.YES_NO_OPTION)){
                case JOptionPane.YES_OPTION:
                    //Multipla escolha
                    avaliacao.novaQuestao(lerObjetiva());
                    break;
                case JOptionPane.NO_OPTION:
                    //Dissertativa
                    avaliacao.novaQuestao(lerDissertativa());
                    break;
            }
        }while(!avaliacao.isEstaPronta());

        JOptionPane.showMessageDialog(null, "Vamos começar a prova.");

        questao=1;
        do{
            resposta = JOptionPane.showInputDialog(avaliacao.getQuestaoAt(questao).apresentaQuestao());
            if(avaliacao.getQuestaoAt(questao).tipoQuestao() == Dissertativa.TIPO_QUESTAO){
                avaliacao.novaResposta(questao, new Resposta((Dissertativa) avaliacao.getQuestaoAt(questao), resposta));
            }else{
                //Objetiva
                avaliacao.novaResposta(questao, new Resposta((Objetiva) avaliacao.getQuestaoAt(questao), Integer.parseInt(resposta)));
            }
            questao++;
        }while(!avaliacao.isEstaRespondida());


        questao = 1;
        do{
            if(avaliacao.getQuestaoAt(questao).tipoQuestao() == Dissertativa.TIPO_QUESTAO){
                switch (JOptionPane.showConfirmDialog(null, avaliacao.getRespostaAt(questao).corrigirDissertativa() + "\nEstá correta?", "Correção de dissertativa", JOptionPane.YES_NO_OPTION)){
                    case JOptionPane.YES_OPTION:
                        avaliacao.getRespostaAt(questao).corrigirDissertativa(true);
                        break;
                    case JOptionPane.NO_OPTION:
                        avaliacao.getRespostaAt(questao).corrigirDissertativa(false);
                }
            }
            questao++;
        }while(questao <= avaliacao.getQtdadeQuestoes());

        JOptionPane.showMessageDialog(null, "Pontuação total: " + avaliacao.pontuacaoTotal());
    }


    public static Objetiva lerObjetiva(){
        Objetiva questao;
        float value;
        String enunciado;
        String alternativas[];
        int alternativaCorreta, qtdAlternativa;

        enunciado = JOptionPane.showInputDialog("Enunciado da questão: ");
        value = Float.parseFloat(JOptionPane.showInputDialog("Valor da questão: "));
        qtdAlternativa = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alternativas (2 ou 5): "));
        switch (qtdAlternativa){
            case 5:
                alternativas = new String[5];
                for(int i=1; i<6; i++){
                    alternativas[i-1] = JOptionPane.showInputDialog("Alternativa " + i + ": ");
                }
                alternativaCorreta = Integer.parseInt(JOptionPane.showInputDialog("Alternativa correta (de 1 a 5): "));
                questao = new Objetiva(enunciado, value, alternativas[0], alternativas[1], alternativas[2], alternativas[3], alternativas[4], alternativaCorreta);
                break;

            default:
                alternativas = new String[2];
                for(int i=1; i<3; i++){
                    alternativas[i-1] = JOptionPane.showInputDialog("Alternativa " + i + ": ");
                }
                alternativaCorreta = Integer.parseInt(JOptionPane.showInputDialog("Alternativa correta (1 ou 2): "));
                questao = new Objetiva(enunciado, value, alternativas[0], alternativas[1], alternativaCorreta);
        }
        return questao;
    }

    public static Dissertativa lerDissertativa(){
        Dissertativa questao;
        float value;
        String enunciado, respCorreta;

        enunciado = JOptionPane.showInputDialog("Enunciado da questão: ");
        value = Float.parseFloat(JOptionPane.showInputDialog("Valor da questão: "));
        respCorreta = JOptionPane.showInputDialog("Resposta da questão: ");
        questao = new Dissertativa(enunciado, value, respCorreta);

        return questao;
    }
}


