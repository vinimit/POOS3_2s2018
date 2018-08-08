import java.util.Scanner;

public class Pessoa {
	
	public static final int MAXIMO = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idades[] = new int[Pessoa.MAXIMO];
        int i;
        double media;

        System.out.println("Informe 10 idades: ");
        media = 0;
        for(i=0; i<Pessoa.MAXIMO; i++){
            idades[i] = input.nextInt();
            media += idades[i];
        }
        media /= Pessoa.MAXIMO;
        for(i=0; i<Pessoa.MAXIMO; i++){
            if(idades[i] > media)
                System.out.println("Idade " + idades[i] + " está acima da média");
            else
                if (idades[i] < media)
                    System.out.println("Idade " + idades[i] + " está abaixo da média");
                else
                    System.out.println("Idade " + idades[i] + " está exatamente na média");
        }
    }

}
