package ejercicio11;

public class Circulo extends Figura {
    private double radio;
    public Circulo(String color, boolean hayRelleno, double radio) {
        super(color, hayRelleno);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    @Override
    public double calcularPerimetro() {
        return 2.0 * Math.PI * radio;
    }
}
