package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int limiteLitros1 = 50;
        final int limiteLitros2 = 150;
        float pagoTotalConsumoAgua = 10;
        int consumoRealLitros;
        System.out.print("Ingrese la cantidad de litros de agua que consume: ");
        consumoRealLitros = input.nextInt();
        consumoRealLitros -= limiteLitros1;
        for (int i = 0; i < 2 && consumoRealLitros > 0; i++) {
            pagoTotalConsumoAgua += consumoRealLitros * (i + 0.5f);
            consumoRealLitros = consumoRealLitros - limiteLitros2;
        }
        System.out.println("Pago que debe realizar una familia por el consumo de agua potable: $" + pagoTotalConsumoAgua);
    }
}
