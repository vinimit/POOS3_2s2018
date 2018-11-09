package exemplo3;

import java.io.*;

public class Escreve {
	public static void main(String[] args) throws IOException{
        OutputStream outputStream;
        OutputStreamWriter outputStreamWriter;
        String frase;

        frase = "Prova de POOS3 em 30/11/2018";
        //frase = "Acorda Pio";
        outputStream = new FileOutputStream("/home/ednilsonrossi/Desktop/mensagem.txt");
        outputStreamWriter = new OutputStreamWriter(outputStream);
        for(char c : frase.toCharArray()){
            outputStream.write(c);
        }
        outputStreamWriter.close();
        outputStream.close();
    }
}
