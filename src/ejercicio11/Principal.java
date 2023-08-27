package ejercicio11;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(
                "Verde",
                true,
                5.0);
        circulo.setColor("Verde agua");
        Rectangulo rectangulo = new Rectangulo(
                "Azul",
                true,
                3.0,
                8.0);
        rectangulo.setHayRelleno(false);
        Triangulo triangulo = new Triangulo(
                "Rojo",
                false,
                8.0,
                9.0,
                15.0);
        triangulo.setColor("Rojo oscuro");
        String[] datosMostrar = {"Área: ", "Perímetro: "};
        System.out.println("CÍRCULO");
        System.out.println(datosMostrar[0] + circulo.calcularArea());
        System.out.println(datosMostrar[1] + circulo.calcularPerimetro());
        System.out.println("RECTÁNGULO");
        System.out.println(datosMostrar[0] + rectangulo.calcularArea());
        System.out.println(datosMostrar[1] + rectangulo.calcularPerimetro());
        System.out.println("TRIÁNGULO");
        System.out.println(datosMostrar[0] + triangulo.calcularArea());
        System.out.println(datosMostrar[1] + triangulo.calcularPerimetro());
    }
}