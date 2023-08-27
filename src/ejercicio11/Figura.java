package ejercicio11;

public abstract class Figura {
    private String color;
    private boolean hayRelleno;
    protected Figura(String color, boolean hayRelleno) {
        this.color = color;
        this.hayRelleno = hayRelleno;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isHayRelleno() {
        return hayRelleno;
    }
    public void setHayRelleno(boolean hayRelleno) {
        this.hayRelleno = hayRelleno;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
