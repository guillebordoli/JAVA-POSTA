package Ejercicio7;
import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {
		int vocales = 0;
		int consonantes = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una palabra para contar sus vocales y consonantes: ");
		String palabra = scanner.nextLine();
		for(int i = 0; i<palabra.length(); i++) {
			char palabra_minusc = Character.toLowerCase(palabra.charAt(i));
			if(Character.isLetter(palabra_minusc)) {
				if(palabra_minusc == 'a' ||palabra_minusc == 'e' || palabra_minusc =='i' || palabra_minusc == 'o' || palabra_minusc == 'u' ) {
					vocales++;
				}else {
					consonantes++;
				}
			}
		}
		System.out.println("Vocales: " + vocales);
		System.out.println("Consonantes" + consonantes);
	}

}
