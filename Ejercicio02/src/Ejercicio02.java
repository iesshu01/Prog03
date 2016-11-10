
import java.util.*;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int N;
		int multiplicador;

		N = teclado.nextInt();
		
		if ( 1 <= N && N <= 100 ) {
			System.out.println("TABLA DE MULTIPLICAR DE " + N);
			multiplicador = 1;
			while ( multiplicador <= 10 ) {
				System.out.println(N + " * " + multiplicador +
						" = " + N * multiplicador);
				multiplicador++;
			}
			
		} else
			System.out.println("Error: " + N + " no está entre 1 y 100");
		
	}

}