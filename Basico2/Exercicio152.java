package Basico2;

import java.util.Scanner;

public class Exercicio152 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("input first number: ");
		int num1 = in.nextInt();
		System.out.println("input second number: ");
		int num2 = in.nextInt();
		System.out.println("input third number: ");
		int num3 = in.nextInt();
		System.out.println("input fourth number: ");
		int num4 = in.nextInt();
		in.close();
		
		if(num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("the number is equals.");
		}else {
			System.out.println("numbers are not equal.");
		}
		
		
		
		
	}
}
