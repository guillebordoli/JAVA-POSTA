//3. Pedir números por pantalla hasta que alguno sea mayor a 100 y además sea un numero primo
package Ejercicio3;
import java.util.Scanner;
public class ejercicio3 {
	 public static boolean esPrimo(int num) {
	        if (num <= 1) return false;
	        if (num == 2) return true;
	        if (num % 2 == 0) return false;
	        
	        for (int i = 3; i * i <= num; i += 2) {
	            if (num % i == 0) return false;
	        }
	        return true;
	 }
	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		do {
		
		System.out.println("ingrese un numero mayor a 0:");
		numero = scanner.nextInt();
		}while(!(numero > 100 && esPrimo(numero)));
		System.out.println("Programa terminado por haber ingresado un numero primo mayor a 100");
	}
}