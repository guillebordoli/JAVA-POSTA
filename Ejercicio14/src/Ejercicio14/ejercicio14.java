package Ejercicio14;
import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese la cantidad de términos de Fibonacci que desea generar: ");
	        int n = scanner.nextInt();
	        System.out.println("Secuencia de Fibonacci con " + n + " términos:");
	        if (n >= 1) {
	            System.out.print("0 ");
	        }
	        if (n >= 2) {
	            System.out.print("1 ");
	        }
	        int a = 0, b = 1;
	        for (int i = 3; i <= n; i++) {
	            int siguiente = a + b;
	            System.out.print(siguiente + " ");
	            a = b;
	            b = siguiente;
	        }
	        scanner.close();
	}

}
