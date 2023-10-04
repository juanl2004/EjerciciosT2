package ejerciciost2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número: ");
		num1= sc.nextDouble();
		
		
		System.out.println("Escribe un número: ");
		num2= sc.nextDouble();
		
		if (num1 < num2) {
			System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num2);
		
		} else if (num1 > num2) {
			System.out.println("Números ordenados de menor a mayor: " + num2 + ", " + num1);
	        
		} else {
			System.out.println("Los números son iguales: " + num1 + ", " + num2);
	        }
	        
	        sc.close();
	}

}
