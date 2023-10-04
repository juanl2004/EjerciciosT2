package ejerciciost2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Declaramos la variable como int porque vamos a introducir un número entero.
		int num;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario un número.
		System.out.println("Escribe un numero: ");
		
		//Leemos ese número del teclado.
		num = sc.nextInt();
		
		// Uso el if para que a partir de esta condición me muestre si es "par".
		if (num%2 == 0){
			System.out.println("Par");
			
		} else { // Utilizo el else porque en caso de que no se cumpla la condición anterior me muestre "impar".
			System.out.println("Impar");
		}
		
		//Cierre Scanner.
		sc.close();
	}

}
