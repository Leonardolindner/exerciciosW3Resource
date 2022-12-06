package Metodos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Contador de vogais");
		System.out.println("Insire uma String!");
		String str = in.next();
		System.out.println("Número de vogais é " + contadorVogais(str));
		in.close();
	}
	
	public static int contadorVogais(String str) {
		
		int cont = 0;
		for(int i=0; i < str.length();i++) {
			if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) == 'i' || 
					str.charAt(i) =='o' || str.charAt(i) == 'u') {
				cont++;
			}
		}
		return cont;
	}
}
