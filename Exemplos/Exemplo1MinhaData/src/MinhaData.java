
public class MinhaData {
	private int dia;
    private int mes;
    private int ano;

    public MinhaData(int oDia, int oMes, int oAno){
        if(ehValida(oDia, oMes, oAno)){
            dia = oDia;
            mes = oMes;
            ano = oAno;
        }else{
            dia = 1;
            mes = 1;
            ano = 1900;            
        }
    }

    private boolean ehValida(int oDia, int oMes, int oAno){
        boolean result = false;
        
        if(oDia >= 1 && oDia <= 31){
            result = true;
        }

        if(result && (oMes < 1 || oMes > 12)){
            result = false;
        } 

        if(result && oAno < 0){
            result = false;
        }        
        return result;
    }

    public String dataBrazil(){
        String txt;
        txt = dia + "/" + mes + "/" + ano;
        return txt;
    }

    public String dataUS(){
        String txt;
        txt = ano + "-" + mes + "-" + dia;
        return txt;
    }
}
