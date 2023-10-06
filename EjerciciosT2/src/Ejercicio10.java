package ejerciciost2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tres numeros enteros: ");
	
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	
	 if ((num1+num2) == (num3)) {
		 System.out.println("La suma de num1 y num2 da num3");
		
	} else if (num1+num3 == num2) {
		System.out.println("La suma de num1 y num3 da num2;");
	
	} else if (num2+num3 == num2) {
		System.out.println("La suma de num2 y num3 da num1;");
		
	} else 
	
	sc.close();
	}
}