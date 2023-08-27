package ejercicio12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();
    private List<LibraryUser> users = new ArrayList<>();
    private static final String MENSAJE_NO_EXISTE_ITEM = "El item no existe.";
    private static final String MENSAJE_NO_EXISTE_USER = "El usuario no existe.";
    private static final String MENSAJE_YA_PRESTADO_ITEM = "El item ya se encuentra prestado.";
    private static final String MENSAJE_NO_SOLICITADO_ITEM_POR_USER = "El item no fue solicitado por usted.";
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
    public int cantidadItems() {
        return items.size();
    }
    private void addItemByObject(LibraryItem item) {
        items.add(item);
    }
    private void deleteItemByObject(LibraryItem item) {
        items.remove(item);
    }
    public String addItem(LibraryItem item) {
        item.setId(UUID.randomUUID().toString());
        addItemByObject(item);
        return "Se agregó el item con ID: " + item.getId();
    }
    public LibraryItem buscarItem(String id) {
        LibraryItem itemEncontrado = null;
        Iterator<LibraryItem> itemIterator = items.iterator();
        while (itemIterator.hasNext() && itemEncontrado == null) {
            LibraryItem item = itemIterator.next();
            if (item.getId().equalsIgnoreCase(id)) {
                itemEncontrado = item;
            }
        }
        return itemEncontrado;
    }
    public String deleteItem(String id) {
        LibraryItem item = buscarItem(id);
        if (item == null) {
            return MENSAJE_NO_EXISTE_ITEM;
        }
        else {
            deleteItemByObject(item);
            return "Item eliminado: \n" + item.mostrarInformacion();
        }
    }
    public List<LibraryUser> getUsers() {
        return users;
    }
    public void setUsers(List<LibraryUser> users) {
        this.users = users;
    }
    public void deleteUsers() {
        users.clear();
    }
    public int cantidadUsers() {
        return users.size();
    }
    private void addUserByObject(LibraryUser user) {
        users.add(user);
    }
    private void deleteUserByObject(LibraryUser user) {
        users.remove(user);
    }
    public String addUser(LibraryUser user) {
        addUserByObject(user);
        return "Se agregó el usuario con ID: " + user.getId();
    }
    public LibraryUser buscarUser(String id) {
        LibraryUser userEncontrado = null;
        Iterator<LibraryUser> userIterator = users.iterator();
        while (userIterator.hasNext() && userEncontrado == null) {
            LibraryUser user = userIterator.next();
            if (user.getId().equalsIgnoreCase(id)) {
                userEncontrado = user;
            }
        }
        return userEncontrado;
    }
    public String deleteUser(String id) {
        LibraryUser user = buscarUser(id);
        if (user == null) {
            return MENSAJE_NO_EXISTE_USER;
        }
        else {
            deleteUserByObject(user);
            return "Usuario eliminado: \n" + user.mostrarInformacion();
        }
    }
    public String prestarItemUsuario(LibraryUser user, String id) {
        LibraryItem item = buscarItem(id);
        if (item == null) {
            return MENSAJE_NO_EXISTE_ITEM;
        }
        else if (item.isEstaPrestado()) {
            return MENSAJE_YA_PRESTADO_ITEM;
        }
        else {
            user.addItemPrestado(item);
            item.setEstaPrestado(true);
            return "Item prestado: \n" + item.mostrarInformacion();
        }
    }
    public String devolverItemUsuario(LibraryUser user, String id) {
        LibraryItem item = buscarItem(id);
        if (item == null) {
            return MENSAJE_NO_EXISTE_ITEM;
        }
        else if (user.getItemsPrestados().contains(item)) {
            user.deleteItemPrestado(item);
            item.setEstaPrestado(false);
            return "Item devuelto: \n" + item.mostrarInformacion();
        }
        else {
            return MENSAJE_NO_SOLICITADO_ITEM_POR_USER;
        }
    }
    public void mostrarInformacion() {
        System.out.println("Usuarios: {");
        users.forEach((LibraryUser::mostrarInformacionCompleta));
        System.out.println("}");
        System.out.println("Items: {");
        items.forEach((item -> System.out.println("- " + item.mostrarInformacion())));
        System.out.println("}");
    }
}