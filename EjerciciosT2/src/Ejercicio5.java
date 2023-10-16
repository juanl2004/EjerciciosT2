package ejerciciost2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaramos las variables de los 3 números enteros que le pediremos al usuario.
		int num1;
		int num2;
		int num3;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario e primer número.
		System.out.println("Escribe un número para ordenarlo de mayor a menor: ");
		//Leemos el primer número del teclado.
		num1 = sc.nextInt();
		
		//Le pedimos al usuario el segundo número.
		System.out.println("Escribe un número para ordenarlo de mayor a menor: ");
		
		//Leemos el segundo número del teclado.
		num2 = sc.nextInt();
		
		//Le pedimos al usuario el tercer número.
		System.out.println("Escribe un número para ordenarlo de mayor a menor: ");
		
		//Leemos el tercer número del teclado.
		num3 = sc.nextInt();
		
		//Comprobamos mediante el if si num 1, es mayor que num2 y num2 es mayor que num3.
		if (num1 > num2 && num2 > num3) {
			//Si esta función se cumple se imprimirá (num1>num2>num3).
			System.out.println("Números ordenados de mayor a menor: " + num1 + ", " + num2 + ", " + num3);
		
		//Comprobamos mediante el else if si num 1, es mayor que num3 y num3 es mayor que num2.
		} else if (num1 > num3 && num3 > num2) {
			//Si esta función se cumple se imprimirá (num1>num3>num2).
			System.out.println("Números ordenados de mayor a menor: " + num1 + ", " + num3 + ", " + num2);
			
		//Comprobamos mediante el else if si num 2, es mayor que num1 y num1 es mayor que num3.
		} else if (num2 > num1 && num1 > num3){
			//Si esta función se cumple se imprimirá (num2>num1>num3).
			System.out.println("Números ordenados de mayor a menor: " + num2 + ", " + num1 + ", " + num3);
		
		//Comprobamos mediante el else if si num 2, es mayor que num3 y num3 es mayor que num1.
		} else if (num2 > num3 && num3 > num1){
			//Si esta función se cumple se imprimirá (num2>num3>num1).
			System.out.println("Números ordenados de mayor a menor: " + num2 + ", " + num3 + ", " + num1);
		
		//Comprobamos mediante el else if si num 3, es mayor que num1 y num1 es mayor que num2.
		} else if (num3 > num1 && num1 > num2){
			//Si esta función se cumple se imprimirá (num3>num1>num2).
			System.out.println("Números ordenados de mayor a menor: " + num3 + ", " + num1 + ", " + num2);
			
		//Comprobamos mediante el else if si num 3, es mayor que num2 y num2 es mayor que num1.
		} else if (num3 > num2 && num2 > num1){
			//Si esta función se cumple se imprimirá (num3>num2>num1).
			System.out.println("Números ordenados de mayor a menor: " + num3 + ", " + num2 + ", " + num1);
	        
		}
		//Cierre.
		sc.close();
	}

}
