package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantas Notas: ");
		int qtdeNotas = teclado.nextInt();
		
		double[] notas = new double[qtdeNotas];
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a Nota " + (i + 1) + ":");
			notas[i] = teclado.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		double media = total / notas.length;
		
		System.out.println("A Media é " + media + "!");
		
		teclado.close();
	}
}
