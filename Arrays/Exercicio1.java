package Arrays;

import java.util.Arrays;

public class Exercicio1 {
	public static void main(String[] args) {
		int[] numbers = {1789,9981,5648,6652};
		String[] worlds= {"java","python","javascript", "ruby"};
		System.out.println("como foi iterado: " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("em forma crescente: " + Arrays.toString(numbers));
		System.out.println();
		System.out.println("como foi iterado: " + Arrays.toString(worlds));
		Arrays.sort(worlds);
		System.out.println("em forma crescente: " + Arrays.toString(worlds));
		
	}

}
