package ejercicio09;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Ingrese un número: ");
        n = input.nextInt();
        int[] arreglo = new int[n];
        int[] arregloInvertido = new int[n];
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (rnd.nextDouble() * 100 + 1);
            System.out.print(arreglo[i] + " ");
        }
        System.out.print("\nArray invertido: ");
        for (int i = 0; i < n; i++) {
            arregloInvertido[i] = arreglo[n - 1 - i];
            System.out.print(arregloInvertido[i] + " ");
        }
    }
}
