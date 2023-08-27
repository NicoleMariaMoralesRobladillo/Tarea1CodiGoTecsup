package ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private String nombre;
    private String id;
    private List<LibraryItem> itemsPrestados = new ArrayList<>();
    public LibraryUser(String nombre, String id, List<LibraryItem> itemsPrestados) {
        this.nombre = nombre;
        this.id = id;
        this.itemsPrestados = itemsPrestados;
    }
    public LibraryUser(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<LibraryItem> getItemsPrestados() {
        return itemsPrestados;
    }
    public void setItemsPrestados(List<LibraryItem> itemsPrestados) {
        this.itemsPrestados = itemsPrestados;
    }
    public void addItemPrestado(LibraryItem libraryItem) {
        itemsPrestados.add(libraryItem);
    }
    public void deleteItemPrestado(LibraryItem libraryItem) {
        itemsPrestados.remove(libraryItem);
    }
    public String mostrarInformacion() {
        return "Nombre: " + nombre
                + "\nID: " + id
                + "\nItems prestados: \n" + itemsPrestados.toString();
    }
}