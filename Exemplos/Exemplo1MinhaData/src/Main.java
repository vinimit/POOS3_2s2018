public class Main {

	public static void main(String[] args) {
		MinhaData hoje;

        hoje = new MinhaData(27, 17, 2018);

        System.out.println("Hoje no Brasil.: " + hoje.dataBrazil());
        System.out.println("Hoje nos EUA...: " + hoje.dataUS());

	}
}
