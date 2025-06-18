package Ejercicio13;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los grados que quiera pasara Celsius o Fahrenheit: ");
		int grados = scanner.nextInt();
		System.out.println("Ingrese a que grados quiere pasarlos (1 para Celsius y 2 para Fahrenheit): ");
		int res = scanner.nextInt();
		if(res == 1) {
			int Cel = (grados - 32)*(5/9);
			System.out.println("Los grados " + grados + " en Celsius son: "+ Cel);
		}else{
			int Far = grados *(9/5)+32;
			System.out.println("Los grados " + grados + " en Fahrenheit son: " + Far);
		}
	}

}
