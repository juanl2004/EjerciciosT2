package ejerciciost2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Declaramos las variables num1, num2 y num3, que son los 3 números que le pedimos al usuario.
		int num1, num2, num3;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario el primer número.
		System.out.print("Escribe un número: ");
		//Leemos el número 1 del teclado.
	    num1 = sc.nextInt();
	    
	    //Le pedimos al usuario el segundo número.
	    System.out.print("Escribe otro número: ");
	    //Leemos el número 2 del teclado.
	    num2 = sc.nextInt();
	    
	    //Le pedimos al usuario el tercer número.
	    System.out.print("Ecribe otro número: ");
	    //Leemos el número 3 del teclado.
	    num3 = sc.nextInt();
		
	    //Comprobamos si la suma del número 1 y la del número 2 es igual al número 3.
	    if (num1 + num2 == num3) {
	    	//Si esto se cumple se imprime que la suma de num1 y num2 = num3.
            System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);
        
         //Comprobamos si la suma del número 1 y la del número 3 es igual al número 2.
	    } else if (num1 + num3 == num2) {
	    	//Si esto se cumple se imprime que la suma de num1 y num3 = num2.
	    	System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);
        
         //Comprobamos si la suma del número 2 y la del número 3 es igual al número 1.
	    } else if (num2 + num3 == num1) {
	    	//Si esto se cumple se imprime que la suma de num2 y num3 = num1.
	    	System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);
        
	    //Si no se cumple ninguna de las anteriore condiciones se da este caso.
	    } else {
            //Si esto se cumple se imprimirá "Ninguna combinación de dos números suma igual al tercer número.".
	    	System.out.println("Ninguna combinación de dos números suma igual al tercer número.");
        }
	  //Cierre
	  sc.close();
	}

}
