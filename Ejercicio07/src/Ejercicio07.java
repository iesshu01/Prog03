import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int N, elMayor, elMenor;
		int suma, total; // calculamos la media aritm�tica

		suma = total = 0;
		N = teclado.nextInt();
		elMayor = elMenor = N;
		while ( N != 0 ) {
			// Actualizo mayor y menor
			if ( N > elMayor )
				elMayor = N;
			if ( N < elMenor )
				elMenor = N;
			
			// Actualizo valores de la media
			total++;
			suma += N;
			
			N = teclado.nextInt();
		}
		System.out.println("N�meros introducidos: " + total);
		System.out.println("Suma total: " + suma);
		System.out.println("Media aritm�tica: " + suma/total);
		System.out.println("N�mero mayor " + elMayor + " y menor " + elMenor);
	}
}
