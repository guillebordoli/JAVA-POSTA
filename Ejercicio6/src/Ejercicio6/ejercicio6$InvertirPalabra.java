package Ejercicio6;
import java.util.Scanner;
public class ejercicio6$InvertirPalabra {

		    public static void main(String[] args) {
		    	Scanner scanner = new Scanner(System.in);
		    	System.out.println("Ingrese una palabra para invertir: ");
		        String palabra = scanner.nextLine();
		        String palabraInvertida = invertirPalabra(palabra);
		        System.out.println("Palabra original: " + palabra);
		        System.out.println("Palabra invertida: " + palabraInvertida);
		        scanner.close();
		    }
		    
		    public static String invertirPalabra(String palabra) {
		        String invertida = "";
		        for(int i = palabra.length() - 1; i >= 0; i--) {
		            invertida += palabra.charAt(i);
		        }
		        return invertida;
		  }
}