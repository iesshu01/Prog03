import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int N, sumaPar, sumaImpar;
		boolean lecturaPar = false;

		sumaPar = sumaImpar = 0;
		N = teclado.nextInt();
		while ( N != 0 ) {
			if ( lecturaPar )
				sumaPar += N;
			else
				sumaImpar += N;
			
			lecturaPar = ! lecturaPar;
			N = teclado.nextInt();
		}
		System.out.println("Suma de los números introducidos en posición impar: " + sumaImpar);
		System.out.println("Suma de los números introducidos en posición par: " + sumaPar);
		
	}
}
