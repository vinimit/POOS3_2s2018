
public class MinhaData {
	private int dia;
    private int mes;
    private int ano;

    public MinhaData(int oDia, int oMes, int oAno){
        dia = oDia;
        mes = oMes;
        ano = oAno;
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
