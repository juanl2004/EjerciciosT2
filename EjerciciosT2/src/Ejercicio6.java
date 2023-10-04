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
		 double sol3;
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Cual es el valor de (a): ");
		 a = sc.nextDouble();
		
		 System.out.println("Cual es el valor de (b): ");
		 b = sc.nextDouble();
		 
		 System.out.println("Cual es el valor de (c): ");
		 c = sc.nextDouble();
		 
		 raiz = (b*b-4*a*c);
		 sol1 = (-b + Math.sqrt(raiz)) / (2 * a);
		 sol2 = (-b - Math.sqrt(raiz)) / (2 * a);
		 sol3 = (-b / (2 * a));
		
		 if (raiz > 0) {
			 System.out.println("La primera solución es: " + sol1);
			 System.out.println("La segunda solución es: " + sol2);
		 } else if (raiz == 0){
			 System.out.println("La unica solución es: " + sol3);
		 
		 } else if (raiz < 0){
			 System.out.println("No existe solución");
		
		 }	 
		
		 sc.close();
	}

}
