package exemplo3;

import java.io.*;

public class Escreve2 {
	public static void main(String[] args) throws IOException{
        OutputStream outputStream;
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        String frase;

        //frase = "Prova de POOS3 em 30/11/2018";
        frase = "Acorda Pio!!";
        outputStream = new FileOutputStream("/home/ednilsonrossi/Desktop/mensagem.txt");
        outputStreamWriter = new OutputStreamWriter(outputStream);
        bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write(frase);
        bufferedWriter.newLine();
        bufferedWriter.write(frase);
        bufferedWriter.newLine();
        bufferedWriter.write(frase);
        bufferedWriter.newLine();
        bufferedWriter.write("Vou estudar muito até lá!!!");

        bufferedWriter.close();
    }
}
