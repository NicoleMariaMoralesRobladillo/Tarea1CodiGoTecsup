package ejercicio08;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Ingrese un número: ");
        n = input.nextInt();
        int[] arreglo = new int[n];
        int mayor = 0;
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (rnd.nextDouble() * 100 + 1);
            System.out.print(arreglo[i] + " ");
            if (i == 0 || mayor < arreglo[i]) {
                mayor = arreglo[i];
            }
        }
        System.out.println("\nEl mayor elemento del array es: " + mayor);
    }
}
