package Ejercicio12;
import java.util.Scanner;


public class ejercicio12 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);           
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();               
        int suma = calcularSumaDigitos(numero);            
       System.out.println("La suma de los dígitos de " + numero + " es: " + suma);        
    }   
    public static int calcularSumaDigitos(int num) {       
        num = Math.abs(num);
        int suma = 0;        
        while (num > 0) {
            suma += num % 10;  
            num /= 10;         
        }
        
        return suma;
    }
}