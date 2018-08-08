package model;

public class Vendedor {
    public static final int MESES = 12;

    private String nome;
    private double vendasMes[];

    public Vendedor(String nome) {
        this.nome = nome;
        vendasMes = new double[MESES];
    }

    public void setVendasMes(double valor, int mes) {
        vendasMes[mes] = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getVendasAno(){
        double soma=0;
        for(int i=0; i<vendasMes.length; i++){
            soma += vendasMes[i];
        }
        return soma;
    }

    public double getVendasPeriodo(int mesInicio, int mesFinal){
        double soma=0;
        for(; mesInicio <= mesFinal; mesInicio++){
            soma += vendasMes[mesInicio];
        }
        return soma;
    }
}