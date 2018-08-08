package oo;

import java.util.Scanner;

public class MainCuidado {
    public static final int MAXIMO = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person pessoas[] = new Person[MAXIMO];
        Person p, p2;
        int i;
        p = new Person();
	    p2 = new Person();
        for(i=0; i<MAXIMO; i++){
            p.setNome(input.nextLine());
            pessoas[i] = p;
        }
        System.out.println("Pessoas no array:");
        for(i=0;i<MAXIMO;i++){
            System.out.println(pessoas[i].getNome());
        }
    }
}