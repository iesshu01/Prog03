
import java.util.*;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int A, B;
		int contador, suma;

		A = teclado.nextInt();
		B = teclado.nextInt();
		
		if ( A <= B ) {
			contador = A+1;
			suma = 0;
			while ( contador < B ) {
				suma += contador;
				contador++;
			}
			System.out.println("La suma de los números entre " +
			A + " y " + B + " es igual a: " + suma);
			
		} else
			System.out.println("Error: " + A + " no es menor o igual que " + B);
		
	}

}
