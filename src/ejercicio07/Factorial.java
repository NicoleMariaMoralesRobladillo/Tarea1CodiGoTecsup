package ejercicio07;

public class Factorial {

    public int resolverFactorial (int n) {
        int resultado;
        if (n == 1) {
            resultado = 1;
        }
        else {
            resultado = n * resolverFactorial(n - 1);
        }
        return resultado;
    }
}
