package ejercicio12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();
    public Library(List<LibraryItem> items) {
        this.items = items;
    }
    public Library() {
    }
    public List<LibraryItem> getItems() {
        return items;
    }
    public void setItems(List<LibraryItem> items) {
        this.items = items;
    }
    public void deleteItems() {
        items.clear();
    }
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    public void deleteItem(LibraryItem item) {
        items.remove(item);
    }
    public int cantidadItems() {
        return items.size();
    }
    public LibraryItem buscarItemById(String id) {
        LibraryItem itemEncontrado = null;
        Iterator<LibraryItem> itemIterator = items.iterator();
        while (itemIterator.hasNext() && itemEncontrado == null) {
            LibraryItem
        }
    }
    public String mostrarInformacion() {
        return items.toString();
    }
}
