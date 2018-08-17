package view;

import model.*;

public class Main {


    public static void main(String[] args) {

        Biblioteca library = new Biblioteca(5);

        library.cadastraLivro(new Livro(5, "Java como programar", "Deitel & Deitel"));
        library.cadastraVHS(new VHS(10, "De volta a lagoa azul.", "globo", 120));
        library.cadastraDado(new Dado(15, "Dados do último SISU", "INEP", Dado.TIPO_CDROM, 720));
        library.cadastraLivro(new Livro(20, "Desenvolvendo SW em Java", "Russel"));
        library.cadastraAudio(new Audio(25, "Batidão", "Som Livre", Audio.TIPO_DVD, 10, 185));

        int i=0;
        Item objeto;
        do{
            objeto = library.getItemAt(i);
            if(objeto != null){
                /*System.out.println(objeto.toString());
                System.out.println("----------------------------");*/
                System.out.println(objeto.getDescritivo());
            }
            i++;
        }while (objeto != null);

        System.out.println("Total de livros: " + library.quantidadeLivros());
    }
}
