//5. Tabla de Multiplicar: Solicita al usuario un número del 1 al 10. Genera y muestra por consola
//la tabla de multiplicar de ese número del 1 al 10.
package Ejercicio5;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		do {
		System.out.println("ingrese del uno al diez");
		N = scanner.nextInt();
		}while(N < 1 || N > 10);
		for(int i = 1; i <= 10; i++) {
			System.out.println(N + " X " + i + " = "+ i*N);
		}

	}

}
