package ejerciciost2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero de hasta 5 cifras: ");
		num = sc.nextInt();
		
		if (num<10) {
			System.out.println("El número tiene 1 cifra");
		} else if ((10<=num)&&(100>num)) {
			System.out.println("El número tiene 2 cifra");
			
		}else if ((100<=num)&&(1000>num)) {
			System.out.println("El número tiene 3 cifra");
			
		}else if ((1000<=num)&&(10000>num)) {
			System.out.println("El número tiene 4 cifra");
			
		}else if ((10000<=num)&&(100000>num)) {
			System.out.println("El número tiene 5 cifra");
			
		}
		
		sc.close();
		
	}

}
