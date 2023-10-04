package ejerciciost2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número para ordenarlo de mayor a menor: ");
		num1 = sc.nextInt();
		
		System.out.println("Escribe un número para ordenarlo de mayor a menor: ");
		num2 = sc.nextInt();
		
		System.out.println("Escribe un número para ordenarlo de mayor a menor: ");
		num3 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("Números ordenados de mayor a menor: " + num1 + ", " + num2);

		} else if (num1 < num2) {
			System.out.println("Números ordenados de mayor a menor: " + num2 + ", " + num1);
			
		} else {
			System.out.println("Los números son iguales: " + num1 + ", " + num2);
	        }

	}

}
