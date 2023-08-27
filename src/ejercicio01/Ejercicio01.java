package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadHoras;
        int cantidadHorasExtras;
        final int pagoPorHoraNormal = 40;
        final int maximaCantidadHorasTrabajoNormal = 40;
        final int primerLimiteCantidadHorasTrabajoExtra = 8;
        int pagaTotal = 0;
        System.out.print("Ingrese la cantidad de horas de trabajo: ");
        cantidadHoras = input.nextInt();
        pagaTotal += cantidadHoras * pagoPorHoraNormal;
        cantidadHorasExtras = cantidadHoras - maximaCantidadHorasTrabajoNormal;
        for (int i = 0; i < 2 && cantidadHorasExtras > 0; i++) {
            pagaTotal += cantidadHorasExtras * pagoPorHoraNormal;
            cantidadHorasExtras = cantidadHorasExtras - primerLimiteCantidadHorasTrabajoExtra;
        }
        System.out.println("El trabajador cobra en total $" + pagaTotal);
    }
}
