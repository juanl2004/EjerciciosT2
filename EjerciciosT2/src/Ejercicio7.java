package ejerciciost2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Declaramos la variable num como int, ya que debebemos introducir un número entero. 
		int num;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario un número de hasta 5 cifras.
		System.out.println("Escribe un numero de hasta 5 cifras: ");
		
		//Leemos el número del teclado.
		num = sc.nextInt();
		
		//Comprobamos si el número introducido es menor que 10.
		if (num<10) {
			//Si es asi se imprimira que el número introducido tiene 1 cifra.
			System.out.println("El número tiene 1 cifra");
		
		//Comprobamos si el número introducido es mayor o igual que 10, y menor que 100.
		} else if ((10<=num)&&(100>num)) {
			//Si es asi se imprimira que el número introducido tiene 2 cifra.
			System.out.println("El número tiene 2 cifra");
		
		//Comprobamos si el número introducido es mayor o igual que 100, y menor que 1000.
		}else if ((100<=num)&&(1000>num)) {
			//Si es asi se imprimira que el número introducido tiene 3 cifra.
			System.out.println("El número tiene 3 cifra");
		
		//Comprobamos si el número introducido es mayor o igual que 1000, y menor que 10000.
		}else if ((1000<=num)&&(10000>num)) {
			//Si es asi se imprimira que el número introducido tiene 4 cifra.
			System.out.println("El número tiene 4 cifra");
		
		//Comprobamos si el número introducido es mayor o igual que 10000, y menor que 100000.
		}else if ((10000<=num)&&(100000>num)) {
			//Si es asi se imprimira que el número introducido tiene 5 cifra.
			System.out.println("El número tiene 5 cifra");
			
		}
		//Cierre.
		sc.close();
		
	}

}
