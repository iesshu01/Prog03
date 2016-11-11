import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int N, contador;
		long factorial;

		N = teclado.nextInt();
		if ( N > 0 ) {
			factorial = 1;
			contador = 1;
			while ( contador <= N ) 
				factorial *= contador++;
			System.out.println("El factorial de " + N + " es: " + factorial);
		} else
			System.out.println("No puedo calcular el factorial de " + N);

	}
}
