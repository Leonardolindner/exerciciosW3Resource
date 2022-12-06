package Metodos;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero!!!");
		double x = in.nextDouble();
		System.out.println("Digite outro numero!!");
		double y = in.nextDouble();
		System.out.println("Digite outro numero!!!");
		double z = in.nextDouble();
		System.out.println("a média entre esses numeros é " + media(x,y,z));
		
		in.close();
	}
	
	
	public static double media(double x, double y, double z) {
		return (x + y + z) / 3;
	}

}
