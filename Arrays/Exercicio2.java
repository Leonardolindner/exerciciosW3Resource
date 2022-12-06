package Arrays;

import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		int[] myArray = {1598,15622,7894,4444};
		int total = 0;
		for(int i = 0; i < myArray.length;i++) {
			total+= myArray[i]; 
		}
		System.out.println("os conjuntos que contém nesse array são: " + Arrays.toString(myArray));
		System.out.println("e a soma dos conjuntos é " + total);
	}
}
