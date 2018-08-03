package view;

import model.Dado;

public class Main{

    public static void main(String args[]){
        int i;
        Dado dado;

        dado = new Dado();

        for(i=0; i<5; i++){
            System.out.printf("Face: %d\n", dado.getFace());
            dado.jogar();
        }
    }
}
