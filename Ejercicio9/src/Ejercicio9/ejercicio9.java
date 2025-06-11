package Ejercicio9;
import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Num = 0;
		int NumMayor = 0;
		for(int i = 1; i <= 3; i++) {
			System.out.println("Ingrese el numero " + i + ": ");
			Num = scanner.nextInt();
			if(i == 0 || Num > NumMayor) {
				NumMayor = Num;
			}
		}
		System.out.println("El numero mayor es: " + NumMayor);
	}

}