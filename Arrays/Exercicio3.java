package Arrays;



public class Exercicio3 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10] ;
		for(int i =0; i < 10;i++) {
			for(int j = 0; j < 10; j++) {
				matriz[i][j] = 0;
				System.out.printf("%2d",matriz[i][j]);
			}
		}
	}
}
