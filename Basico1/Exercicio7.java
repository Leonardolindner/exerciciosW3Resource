package Basico1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero!");
		int num1 = teclado.nextInt();
		teclado.close();
		System.out.println("Multiplicação deste numero");
		for(int i = 1; i <= 10; i++) {
			System.out.println(num1 * i);
		}
		
		
		
		
		
		
	}

}
