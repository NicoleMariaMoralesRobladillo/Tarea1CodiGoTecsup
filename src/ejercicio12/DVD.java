package ejercicio12;

public class DVD extends LibraryItem {
    private String director;
    private double duracion;
    public DVD(String titulo, String id, boolean estaPrestado, String director, double duracion) {
        super(titulo, id, estaPrestado);
        this.director = director;
        this.duracion = duracion;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "\nDirector: " + director
                + "\nDuración: " + duracion;
    }
}