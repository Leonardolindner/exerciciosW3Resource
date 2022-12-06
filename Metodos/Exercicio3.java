package Metodos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma string");
		String str = in.next();
		
		System.out.println("O caractere do meio é: " + middle(str));
		
		in.close();
	}
	
	 public static String middle(String str)
	    {
	        int position;
	        int length;
	        if (str.length() % 2 == 0)
	        {
	            position = str.length() / 2 - 1;
	            length = 2;
	        }
	        else
	        {
	            position = str.length() / 2;
	            length = 1;
	        }
	        return str.substring(position, position + length);
	    }
}
