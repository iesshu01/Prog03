import java.util.Scanner;

import java.util.*;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int N, divisor = 2;
		boolean esPrimo = true;

		N = teclado.nextInt();
		while (esPrimo && divisor < N ) {
			esPrimo = N % divisor != 0;
			divisor++;
		}
		System.out.print("El número " + N + " es ");
		System.out.println((esPrimo ? "" : "no ") + "primo");
		
	}

}
