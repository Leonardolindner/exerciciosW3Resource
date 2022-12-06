package Basico1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro!!");
		int num1 = teclado.nextInt();
		System.out.println("Digite outro numero inteiro!!");
		int num2 = teclado.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		teclado.close();
		
	}

}
