package model;

public class Loja {
    private final int TOTAL_VENDEDORES = 4;
    private String razaoSocial;
    private Vendedor[] vendedores;
    private int vendedoresCadastrados;

    public Loja(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        vendedores = new Vendedor[TOTAL_VENDEDORES];
        vendedoresCadastrados = 0;
    }

    public boolean insereVendedor(Vendedor vendedor){
        boolean deuCerto = false;
        if(vendedoresCadastrados < TOTAL_VENDEDORES){
            vendedores[vendedoresCadastrados] = vendedor;
            vendedoresCadastrados++;
            deuCerto = true;
        }
        return deuCerto;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public Vendedor getMelhorVendedor(){
        Vendedor melhor=null;

        if(vendedoresCadastrados > 0){
            melhor = vendedores[0];
            for(int i=1; i<vendedoresCadastrados; i++){
                if(vendedores[i].getVendasAno() > melhor.getVendasAno()){
                    melhor = vendedores[i];
                }
            }
        }
        return melhor;
    }
}