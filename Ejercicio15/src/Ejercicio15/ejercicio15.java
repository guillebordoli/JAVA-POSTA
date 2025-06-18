package Ejercicio15;
import java.util.Scanner;
public class ejercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la operacion que desea realizar (1 para depositar, 2 para retirar y 3 para consultar saldo: ");
		int res = scanner.nextInt();
		if(res == 1) {
			System.out.println("Ingrese cuanto quiere depositar: ");
			int depo = scanner.nextInt();
			int depoF = 1000 + depo;
			System.out.println("Su saldo final es: " + depoF);
		}
		if(res == 2) {
			System.out.println("Ingrese cuanto quiere retirar: ");
			int ret = scanner.nextInt();
			if(ret > 1000) {
				System.out.println("Usted no tiene suficiente saldo");
			}
			int retF = 1000 - ret;
			System.out.println("Su saldo queda con: " + retF);
		}else if(res == 3){
			System.out.println("Su saldo es de: 1000$");
		}
	}

}
