package model;

import java.util.ArrayList;

public class Estudante {
	private int prontuario;
    private String nome;
    private ArrayList<Nota> notas;
    
    public Estudante(int prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
        notas = new ArrayList<>();
    }
    
    public void addNota(double valor, double porcentagem){
        notas.add(new Nota(valor, porcentagem));
    }
    
    public double media(){
        double soma=0;
        for(Nota n : notas){
            soma += n.parcial();
        }
        return soma;
    }
    
    public int getProntuario() {
        return prontuario;
    }
    
    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
