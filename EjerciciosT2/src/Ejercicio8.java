package ejerciciost2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
	//Declaramos la variable nota como double, ya que la nota puede contener decimales.
	double nota;
		
	//Creamos el Scanner.
	Scanner sc = new Scanner(System.in);
	
	//Le pedimos al usuario que escriba su nota.
	System.out.println("Escribe un numero real: ");
	//Leemos la nota del teclado.
	nota = sc.nextDouble();
		
		//Comprobamos si la nota es mayor o igual a 0, y menor que 5.
		if ((nota>=0) && (nota<5)){
			//Si es así se imprimira un "INSUFICIENTE".
			System.out.println("Su nota es (INSUFICIENTE)");
		
		//Comprobamos si la nota es mayor o igual a 5, y menor que 6.
		} else if ((5<=nota) && (6>nota)) {
			//Si es así se imprimira un "SUFICIENTE".
			System.out.println("Su nota es (SUFICIENTE)");

			//Comprobamos si la nota es mayor o igual a 6, y menor que 7.
		} else if ((6<=nota) && (7>nota)) {
			//Si es así se imprimira un "BIEN".
			System.out.println("Su nota es (BIEN)");
		
			//Comprobamos si la nota es mayor o igual a 7, y menor que 9.
		} else if ((7<=nota) && (9>nota)) {
			//Si es así se imprimira un "NOTABLE".
			System.out.println("Su nota es (NOTABLE)");
	
			//Comprobamos si la nota es mayor o igual a 9, y menor o igual que 10.
		} else if ((9<=nota) && (10>=nota)) {
			//Si es así se imprimira un "SOBRESALIENTE".
			System.out.println("Su nota es (SOBRESALIENTE)");
	
			//En caso de que no se de ninguna de estas condiciones se mostraria lo siguiente.
		} else {
			//Si es así se imprimirá que la nota es válida.
			System.out.println("La nota no es válida. Debe estar en el rango de 0 a 10.");
			
		}
		//Cierre.
		sc.close();
	}

}
