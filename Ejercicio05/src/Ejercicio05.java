
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int N, suma, total;

		suma = total = 0;
		N = teclado.nextInt();
		while ( N != 0 ) {
			total++;
			suma += N;
			N = teclado.nextInt();
		}
		System.out.println("Números introducidos: " + total);
		System.out.println("Suma total: " + suma);
		
	}

}
