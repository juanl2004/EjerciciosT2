package ejerciciost2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		 double a;
		 double b;
		 double c;
		 double raiz;
		 double sol1;
		 double sol2;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Cual es el valor de (a): ");
		 a = sc.nextDouble();
		
		 System.out.println("Cual es el valor de (b): ");
		 b = sc.nextDouble();
		 
		 System.out.println("Cual es el valor de (c): ");
		 c = sc.nextDouble();
		 
		 raiz = (b*b-4*a*c);
		 sol1 = (-b + raiz)/2*a;
		 sol2 = (-b - raiz)/2*a;
		 
		 if ((sol1!=0)&&(sol2!=0)) {
			 System.out.println("Las soliciónes son: " + sol1 + sol2);
		 
		
		 }	 
		 
	}

}
