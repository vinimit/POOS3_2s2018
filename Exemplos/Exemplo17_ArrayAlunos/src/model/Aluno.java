package model;

public class Aluno {
	private int prontuario;
	private String nome;
	private Nota[] notas;
	
	public Aluno(int prontuario, String nome) {
		this.prontuario = prontuario;
		this.nome = nome;
		notas = new Nota[4];
	}
	
	public void setNotas(double nota1, double nota2, double nota3, 
			double nota4, double peso1, double peso2, double peso3, double peso4){
	    if(peso1 + peso2 + peso3 + peso4 == 100){
	    	notas[0] = new Nota(nota1, peso1);
	        notas[1] = new Nota(nota2, peso2);
	        notas[2] = new Nota(nota3, peso3);
	        notas[3] = new Nota(nota4, peso4);
	    }else{
	    	notas[0] = new Nota(-1, -1);
            notas[1] = new Nota(-1, -1);
            notas[2] = new Nota(-1, -1);
            notas[3] = new Nota(-1, -1);
	    }
	}
	
	public void setNotas(double... argumentos) {
	    int soma = 0;
	    notas[0] = new Nota(-1, -1);
	    notas[1] = new Nota(-1, -1);
	    notas[2] = new Nota(-1, -1);
	    notas[3] = new Nota(-1, -1);
	    if (argumentos.length == 8) {
	        for (int i = 4; i < argumentos.length; i++) {
	            soma += argumentos[i];
	        }
	        if (soma == 100) {
	            for (int i = 0; i < 4; i++) {
	                notas[i].setNota(argumentos[i]);
	                notas[i].setPorcentagem(argumentos[i + 4]);
	            }
	        }
	    }
	}
	
	/*public double media(){
        double soma=0;
        for(int i=0; i < 4; i++){
            soma += notas[i].parcial();
        }
        return soma;
    }*/
	
	public double media(){
        double soma=0;
        for(Nota n : notas){
            soma += n.parcial();
        }
        return soma;
    }
	
	public Nota get(int nota){
        Nota retorno = null;
        if(nota >= 0 && nota <= 3){
            retorno = notas[nota];
        }
        return retorno;
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
