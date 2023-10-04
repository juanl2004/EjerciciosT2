package ejerciciost2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		double num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un número decimal para saber si es (casi cero) o (se excluye): ");
		num = sc.nextDouble();
		
		if ((-1<num)&&(num<1)&&(num!=0)) {
		System.out.println("casi 0");	
		
	}else if (num == -1) {
		System.out.println("no se incluye");
	}else if (num == 0) {
		System.out.println("no se incluye");
	}else if (num == 1) {
		System.out.println("no se incluye");
	}
		
	sc.close();	
		
	}

}
