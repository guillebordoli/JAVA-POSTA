package Ejercicio11;
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anio = 0;
		System.out.println("Ingrese un año y le diremos si es bisiesto");
		anio = scanner.nextInt();
		if(anio % 400 == 0) {
			System.out.println("El año es bisiesto");
		}else if(anio % 4 == 0 && anio % 100 != 0) {
			System.out.println("El año es bisiesto");
		}else {
			System.out.println("El año no es bisiesto");
		}
	}

}
