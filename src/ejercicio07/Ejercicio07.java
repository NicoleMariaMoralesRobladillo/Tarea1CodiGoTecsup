package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        int n;
        Factorial factorial = new Factorial();
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        n = input.nextInt();
        System.out.println("El resultado del factorial de " + n
                + " es: " + factorial.resolverFactorial(n));
    }
}
