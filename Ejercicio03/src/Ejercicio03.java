
import java.util.*;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int N;
		int divisor = 1;

		N = teclado.nextInt();
		while ( divisor < N ) {
			if ( N % divisor == 0 )
				System.out.println(divisor + " es divisor de " + N);
			divisor++;
		}

	}

}
