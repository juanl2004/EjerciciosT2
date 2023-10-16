package ejerciciost2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Mostramos el titulo del juego que vamos a programar.
		System.out.println("Juego de PIEDRA, PAPEL, TIJERA");

		// Declaramos a los 2 jugadores jugador 1, y jugador 2.
		int jugador1, jugador2;

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al jugador 1 que elija entre piedra, papel y tijera. Escribiendo
		// el número correspondiente a la opción que quiera elegir 1, 2 y 3.
		System.out.print("Jugador 1, elija PIEDRA (1), PAPEL (2) o TIJERA (3): ");
		// Leemos la opción elegida del jugador 1 del teclado.
		jugador1 = sc.nextInt();

		// Le pedimos al jugador 2 que elija entre piedra, papel y tijera. Escribiendo
		// el número correspondiente a la opción que quiera elegir 1, 2 y 3.
		System.out.print("Jugador 2, elija PIEDRA (1), PAPEL (2) o TIJERA (3): ");
		// Leemos la opción elegida del jugador 2 del teclado.
		jugador2 = sc.nextInt();

		//Comprobamos si el valor introducido por el jugador 1 es igual al del jugador 2.
		if (jugador1 == jugador2) {
			//Si se cumple esta condición se imprimirá "Empate. Ambos jugadores eligieron lo mismo".
			System.out.println("Empate. Ambos jugadores eligieron lo mismo");

		//Comprobamos si el valor introducido por el jugador 1, es igual a 1, y el jugador 2 es igual 3.
		} else if ((jugador1 == 1) && (jugador2 == 3)) {
			//Si se cumple esta condición se imprimirá "El jugador 1 (piedra), gana al jugador 2 (tijera)".
			System.out.println("El jugador 1 (piedra), gana al jugador 2 (tijera)");

		//Comprobamos si el valor introducido por el jugador 1, es igual a 2, y el jugador 2 es igual 1.
		} else if ((jugador1 == 2) && (jugador2 == 1)) {
			//Si se cumple esta condición se imprimirá "El jugador 1 (papel), gana al jugador 2 (piedra)".
			System.out.println("El jugador 1 (papel), gana al jugador 2 (piedra)");

		//Comprobamos si el valor introducido por el jugador 1, es igual a 3, y el jugador 2 es igual 2.
		} else if ((jugador1 == 3) && (jugador2 == 2)) {
			//Si se cumple esta condición se imprimirá "El jugador 1 (tijera), gana al jugador 2 (papel)".
			System.out.println("El jugador 1 (tijera), gana al jugador 2 (papel)");

		//Comprobamos si el valor introducido por el jugador 2, es igual a 1, y el jugador 1 es igual 3.
		} else if ((jugador2 == 1) && (jugador1 == 3)) {
			//Si se cumple esta condición se imprimirá "El jugador 2 (piedra), gana al jugador 1 (tijera)".
			System.out.println("El jugador 2 (piedra), gana al jugador 1 (tijera)");
		
		//Comprobamos si el valor introducido por el jugador 2, es igual a 2, y el jugador 1 es igual 1.
		} else if ((jugador2 == 2) && (jugador1 == 1)) {
			//Si se cumple esta condición se imprimirá "El jugador 2 (papel), gana al jugador 1 (piedra)".
			System.out.println("El jugador 2 (papel), gana al jugador 1 (piedra)");

		//Comprobamos si el valor introducido por el jugador 2, es igual a 3, y el jugador 1 es igual 2.
		} else if ((jugador2 == 3) && (jugador1 == 2)) {
			//Si se cumple esta condición se imprimirá "El jugador 2 (tijera), gana al jugador 1 (papel)".
			System.out.println("El jugador 2 (tijera), gana al jugador 1 (papel)");
		}
		//Cierre
		sc.close();
	}
}
