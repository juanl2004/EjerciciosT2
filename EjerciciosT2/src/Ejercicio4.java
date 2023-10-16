package ejerciciost2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaramos las variables num1 y num2, que son los números que le pedimos al usuario.
		double num1;
		double num2;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		//Le pedimos el número 1 al usuario.
		System.out.println("Escribe un número: ");
		//Leemos el número 1.
		num1= sc.nextDouble();
		
		//Le pedimos el número 2 al usuario.
		System.out.println("Escribe un número: ");
		//Leemos el número 2.
		num2= sc.nextDouble();
		
		//Comprobamos si el número 1 es menor que el número 2.
		if (num1 < num2) {
			//Si se cumple imprimimos esta solución.
			System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num2);
		
			//Utlizamos la condición else if para comprobar si el número 1 es mayor que el número 2.
		} else if (num1 > num2) {
			//Si se cumple se imprimira esta solución.
			System.out.println("Números ordenados de menor a mayor: " + num2 + ", " + num1);
	        
			//Utlizamos la condición else porque en caso de que no se cumpla el if se cumple esto como ultima opción.
		} else {
			//Si se cumple se imprime esta solución.
			System.out.println("Los números son iguales: " + num1 + ", " + num2);
	        }
	        //Cierre.
	        sc.close();
	}

}
