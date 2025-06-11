package Ejercicio10;
import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=0;
		int resu=1;
		int aux = 0;
		System.out.println("Ingres el numero para el cual quiera su factorial");
		N = scanner.nextInt();
		for(int i = 0; i < N; i++) {
			resu *= N - i;
			
		}
		System.out.println("El factorial de " + N + " es: "  + resu);
	}

}