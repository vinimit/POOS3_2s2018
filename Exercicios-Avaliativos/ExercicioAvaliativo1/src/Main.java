import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int lado1, lado2, lado3;
		int contador;
		boolean ehTriangulo;
		String tipo;
		
		contador = 1;
		do {
			System.out.println("Digite três lados do triangulo:");
			lado1 = input.nextInt();
			lado2 = input.nextInt();
			lado3 = input.nextInt();
			
			ehTriangulo = formaTriangulo(lado1, lado2, lado3);
			
			if(ehTriangulo) {
				tipo = tipoTriangulo(lado1, lado2, lado3);
				System.out.println("DADOS FORMAM " + tipo);
			}else {
				System.out.println("DADOS NÃO FORMAM TRIANGULO");
			}
			contador += 1;
			
		}while(contador <= 5);
		

	}

	public static boolean formaTriangulo(int a, int b, int c) {
		boolean ehTriangulo = false;
		
		if(a+b > c) {
			if(a+c > b) {
				if(b+c > a) {
					ehTriangulo = true;
				}
			}
		}
		
		return ehTriangulo;
	}
	
	public static String tipoTriangulo(int a, int b, int c) {
		String retorno;
		if(!formaTriangulo(a, b, c)) {
			retorno = "NÃO É TRIANGULO";
		}else {
			retorno = "TRIANGULO ";
			if(a == b && b == c) {
				retorno += "EQUILÁTERO";
			}else {
				if(a != b && a != c && b != c) {
					retorno += "ESCALENO";
				}else {
					retorno += "ISÓSCELES";
				}
			}
		}
		return retorno;
	}
}
