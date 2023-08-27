package ejercicio05;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int n;
        System.out.print("Ingrese el tamaño del arreglo: ");
        n = input.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (rnd.nextDouble() * 100 + 1);
            System.out.println("El elemento " + i + " es: " + arreglo[i]);
        }
    }
}
