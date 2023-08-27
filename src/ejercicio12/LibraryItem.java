package ejercicio12;

public abstract class LibraryItem {
    private String titulo;
    private String id;
    private boolean estaPrestado;
    protected LibraryItem(String titulo, boolean estaPrestado) {
        this.titulo = titulo;
        this.estaPrestado = estaPrestado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean isEstaPrestado() {
        return estaPrestado;
    }
    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }
    public String mostrarInformacion() {
        return "Título: " + titulo
                + "\nID: " + id
                + "\n¿Está prestado?: " + estaPrestado;
    }
}