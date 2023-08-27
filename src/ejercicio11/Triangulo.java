package ejercicio11;

public class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    public Triangulo(String color, boolean hayRelleno, double ladoA, double ladoB, double ladoC) {
        super(color, hayRelleno);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getLadoC() {
        return ladoC;
    }
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2.0;
        return Math.sqrt(semiperimetro
                * (semiperimetro - ladoA)
                * (semiperimetro - ladoB)
                * (semiperimetro - ladoC)
        );
    }
    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}