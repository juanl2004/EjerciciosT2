package ejerciciost2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos la variable número ya que sera la que pediremos al usaurio.
		double num;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario un número decimal
		System.out.println("Escriba un número decimal para saber si es (casi cero) o (se excluye): ");

		// Leemos ese número
		num = sc.nextDouble();

		// Comprobamos con la condición del if si el número se encuentra entre el (-1,1).
		if ((-1 < num) && (num < 1) && (num != 0)) {
			// Mostramos casi 0 si la solución si se cumple la condición.
			System.out.println("casi 0");

			// Utilizamos el else if para comprobar si se cumple la condición de que el número es igual a -1.
		} else if (num == -1) {
			System.out.println("no se incluye"); // En caso de que se cumpla se mostraria este resultado.
			
			// Utilizamos el else if para comprobar si se cumple la condición de que el número es igual a 0.
		} else if (num == 0) {
			System.out.println("no se incluye"); // En caso de que se cumpla se mostraria "no se incluye".
			
			// Utilizamos el else if para comprobar si se cumple la condición de que el número es igual a 1.
		} else if (num == 1) {
			System.out.println("no se incluye");// En caso de que se cumpla se mostraria "no se incluye".
		}
		//Cierre
		sc.close();

	}

}
