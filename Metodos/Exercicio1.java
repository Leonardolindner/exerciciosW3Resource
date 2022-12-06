package Metodos;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("insira um numero!!!");
		double num1 = in.nextDouble();
		System.out.println("insira um numero!!!");
		double num2 = in.nextDouble();
		System.out.println("insira um numero!!!");
		double num3 = in.nextDouble();
		
		System.out.println(menorNumero(num1, num2, num3));
		
		in.close();
		
	}
		
	public static double menorNumero(double num1, double num2, double num3) {
		return Math.min(Math.min(num1, num2), num3);
	}
		
		
		
		

}
