package ejerciciost2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos la variable como int porque vamos a introducir un número entero.
		int num1;
		
		//Declaramos la variable como int porque vamos a introducir un número entero.
		int num2;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario un número.
		System.out.println("Escribe un número: ");
		
		//Leemos ese número del teclado.
		num1 = sc.nextInt();
		
		//Le pedimos al usuario otro número.
		System.out.println("Escribe otro número: ");
		
		//Leemos ese número del teclado.
		num2 = sc.nextInt();
		
		// Utilizamos el if porque queremos mostrar "iguales" si se cumple la condición siguiente.
		if (num1 == num2){
			System.out.println("Iguales");
			
		} else { //Utilizo el else porque en caso de que no se cumpla la condición anterior me muestre "no son iguales".
			System.out.println("No son iguales");
		}
		
		 //Cierre Scanner.
		sc.close();
	}

}
