package ejercicio12;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUser user1 = new LibraryUser(
                "Nicole",
                "72127052");
        LibraryUser user2 = new LibraryUser(
                "Maria",
                "27894562");

        System.out.println("\n" + library.addUser(user1));
        System.out.println("\n" + library.addUser(user2));

        Book book1 = new Book(
                "Moby-Dick",
                false,
                "Herman Melville");
        DVD dvd1 = new DVD(
                "Evil Dead: El Despertar",
                false,
                "Lee Cronin",
                27.5);

        System.out.println("\n" + library.addItem(book1));
        System.out.println("\n" + library.addItem(dvd1));

        System.out.println("\n" + library.prestarItemUsuario(user2, dvd1.getId()));
        System.out.println("\n" + library.prestarItemUsuario(user1, book1.getId()) + "\n");

        library.mostrarInformacion();

        System.out.println("\n" + library.devolverItemUsuario(user2, book1.getId()));
        System.out.println("\n" + library.devolverItemUsuario(user2, dvd1.getId()) + "\n");

        library.mostrarInformacion();
    }
}
