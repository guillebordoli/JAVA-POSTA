package Ejercicio8;
import java.util.Random;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int N = random.nextInt(101);
		int intentos = 0;
		int N_u = 0;
		do {
			System.out.println("Ingrese el numero que crea correcto: ");
			N_u = scanner.nextInt();
			if(N_u > N) {
				System.out.println("El numero ingresado es mayor al numero desconocido");
			}else{
				System.out.println("El numero ingresado es menor al numero deconocido");
			}
		}while(N != N_u);
		System.out.println("Ganaste! El numero era: " + N);
	}

}
