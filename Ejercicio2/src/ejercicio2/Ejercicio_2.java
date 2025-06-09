package ejercicio2;
public class Ejercicio_2 {

	public static void main(String[] args) {
		        for (int numero = 50; numero <= 100; numero++) {
		            if (esPrimo(numero)) {
		                System.out.println(numero + ": primo");
		            } else {
		                System.out.print(numero + ": ");
		                mostrarDivisores(numero);
		            }
		        }
		    }
		    public static boolean esPrimo(int num) {
		        if (num <= 1) return false;
		        if (num == 2) return true;
		        if (num % 2 == 0) return false;
		        
		        for (int i = 3; i * i <= num; i += 2) {
		            if (num % i == 0) return false;
		        }
		        return true;
		    }
		    public static void mostrarDivisores(int num) {
		        System.out.print("1");
		        for (int i = 2; i <= num; i++) {
		            if (num % i == 0) {
		                System.out.print(", " + i);
		            }
		        }
		        System.out.println();
		    }
	}