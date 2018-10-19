package view;

import java.util.Scanner;

import model.Aluno;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String nome;
        int prontuario;
        double n1, n2, n3, n4, p1, p2, p3, p4;
        Aluno estudante;
        System.out.println("Nome aluno: ");
        nome = scanner.nextLine();
        System.out.println("Prontuário: ");
        prontuario = scanner.nextInt();
        System.out.println("Nota 1: ");
        n1 = scanner.nextDouble();
        System.out.println("Peso nota 1: ");
        p1 = scanner.nextDouble();
        System.out.println("Nota 2: ");
        n2 = scanner.nextDouble();
        System.out.println("Peso nota 2: ");
        p2 = scanner.nextDouble();
        System.out.println("Nota 3: ");
        n3 = scanner.nextDouble();
        System.out.println("Peso nota 3: ");
        p3 = scanner.nextDouble();
        System.out.println("Nota 4: ");
        n4 = scanner.nextDouble();
        System.out.println("Peso nota 4: ");
        p4 = scanner.nextDouble();
        estudante = new Aluno(prontuario, nome);
        estudante.setNotas(n1, n2, n3, n4, p1, p2, p3, p4);
        System.out.println("Média: " + estudante.media());
	}
}
