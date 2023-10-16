package ejerciciost2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		//Declaramos las variables a, b y c que son los coeficientes, los declaramos como double porque pueden ser decimales.
		double a, b, c;
		
		//Declaramos la variable raiz para calcular la raiz de la ecuación.
		double raiz;
		
		//Declaramos sol1, sol2, sol3 y x1 como double porque son las soluciones posibles que nos puede dar nuesta ecuación.
		double sol1;
		double sol2;
		double sol3;
		double x1;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario el valor de "a".
		System.out.println("Cual es el valor de (a): ");
		//Leemos el valor de "a".
		a = sc.nextDouble();

		//Le pedimos al usuario el valor de "b".
		System.out.println("Cual es el valor de (b): ");
		//Leemos el valor de "b".
		b = sc.nextDouble();

		//Le pedimos al usuario el valor de "c".
		System.out.println("Cual es el valor de (c): ");
		//Leemos el valor de "c".
		c = sc.nextDouble();

		//Instrucciones para calcular el valor de la raiz.
		raiz = (b * b - 4 * a * c);
		
		//Comprobamos si la raiz es menor que 0.
		if (raiz < 0) {
			//Si esta función se cumple se mostrara que no tiene solución final.
			System.out.println("La ecuación no tiene solución final.");
		
		//Comprobamos usando el else if si el valor de "a" es igual a 0.
		} else if (a == 0) {
			//Instrucción que se lleva a cabo para calcular "x1", si se cumple la condición anterior.
			x1 = (double) -c / b;
			//Si esto se cumple se mostrara la solución siguiente, el resultado de "x1".
			System.out.println("La ecuación tiene una única solución: " + x1);
		
		//Comprobamos usando el else if si el valor de la raiz en mayor que 0.
		} else if (raiz > 0) {
			//Si se cumple esta condición, se llevan a cabo las siguientes instrucciones para resolver sol1 y sol2.
			sol1 = (-b + Math.sqrt(raiz)) / (2 * a);
			sol2 = (-b - Math.sqrt(raiz)) / (2 * a);
			//Si se cumple se imprimirá la primera solución "sol1" y la segunda solución, "sol2".
			System.out.println("La primera solución es: " + sol1);
			System.out.println("La segunda solución es: " + sol2);
		
		//Comprobamos usando el else if, si la raiz es igual a 0.
		} else if (raiz == 0) {
			//Si se cumple esta condición, se lleva a cabo la siguiente instrucción para resolver la sol3.
			sol3 = (-b / (2 * a));
			//Si se cumple se imprimirá la tercera solución "sol3".
			System.out.println("La unica solución es: " + sol3);
			
		}
		//Cierre
		sc.close();
	}

}
