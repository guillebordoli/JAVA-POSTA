//4. Suma de N�meros Pares e Impares: Pide al usuario un n�mero entero positivo N. Luego,
//calcula y muestra la suma de todos los n�meros pares desde 1 hasta N, y la suma de todos los
//n�meros impares desde 1 hasta N.
package Ejercicio4;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 0, pares = 0, impares = 0;
		do {
			System.out.println("ingrese un numero entero positivo");
			N = scanner.nextInt();
		}while(N<0);	
		for(int i = 1; i <= N; i++) { 
		if(i % 2 == 0){
			pares += i; 
			} else {
				impares += i;
			}
		}
		System.out.println("Suma de pares: "+ pares);
		System.out.println("Suma de impares: "+ impares);
	}
}
