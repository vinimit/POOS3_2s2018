package oo;

import java.util.Scanner;

public class Main {
	public static final int MAXIMO = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoas[] = new Pessoa[Main.MAXIMO];
        Pessoa p;
        int i;
        double media=0;

        System.out.println("Informe 10 idades : ");
        for(i=0; i<MAXIMO; i++){
            //p = new Pessoa(input.nextInt());
            //pessoas[i] = p;
            pessoas[i] = new Pessoa(input.nextInt());
            
			media += pessoas[i].getIdade();
        }
        media /= MAXIMO;
        for(i=0; i < MAXIMO; i++){
            if(pessoas[i].getIdade() > media)
                System.out.println("Idade " + pessoas[i].getIdade() + " está acima da média");
            else
                if (pessoas[i].getIdade() < media)
                    System.out.println("Idade " + pessoas[i].getIdade() + " está abaixo da média");
                else
                    System.out.println("Idade " + pessoas[i].getIdade() + " está exatamente na média");
        }

    }
}
