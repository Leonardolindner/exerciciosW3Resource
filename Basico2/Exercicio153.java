package Basico2;

import java.util.Scanner;

public class Exercicio153 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input first number: ");
		double num1 = in.nextDouble();
		System.out.println("Input second number: ");
		double num2 = in.nextDouble();
		in.close();
		boolean resultado = false;
		
		if(num1 == 0 && num2 == 1) {
			resultado = true;
		}
		System.out.println(resultado);
	}
}
