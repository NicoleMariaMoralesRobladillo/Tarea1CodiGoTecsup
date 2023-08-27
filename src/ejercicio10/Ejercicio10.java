package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int numeroAleatorio = (int) (rnd.nextDouble() * 100 + 1);
        int numeroIntento;
        int intentos = 0;
        do {
            System.out.print("Ingrese un número: ");
            numeroIntento = input.nextInt();
            if (numeroIntento > numeroAleatorio) {
                System.out.println("Número demasiado alto, intenta nuevamente.");
            }
            if (numeroIntento < numeroAleatorio) {
                System.out.println("Número demasiado bajo, intenta nuevamente.");
            }
            intentos++;
        }
        while (numeroIntento != numeroAleatorio);
        System.out.println("¡Felicidades! ¡Haz adivinado el número!");
        System.out.println("Número a adivinar: " + numeroAleatorio);
        System.out.println("Intentos: " + intentos);
    }
}
