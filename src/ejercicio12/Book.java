package ejercicio12;

public class Book extends LibraryItem {
    private String autor;
    public Book(String titulo, boolean estaPrestado, String autor) {
        super(titulo, estaPrestado);
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "\nAutor: " + autor;
    }
}