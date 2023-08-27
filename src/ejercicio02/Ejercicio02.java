package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        int trajoRegalo = 1;
        String mensajeResultado = "sí";
        System.out.print("Ingrese la edad del usuario: ");
        edad = input.nextInt();
        if (edad >= 15) {
            System.out.print("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0: ");
            trajoRegalo = input.nextInt();
        }
        if (trajoRegalo == 0) {
            mensajeResultado = "no";
        }
        System.out.println("El invitado " + mensajeResultado + " puede ingresar a la fiesta.");
    }
}