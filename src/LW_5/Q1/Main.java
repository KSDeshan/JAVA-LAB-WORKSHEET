package LW_5.Q1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        library.addLibraryItem(b1);
        library.addLibraryItem(b2);
        library.addLibraryItem(b3);

        library.displayLibraryInfo();
        library.listAvailableItems();

        System.out.println("\nChecking out 'Island of a Thousand Mirrors'...");
        library.checkoutItem("Island of a Thousand Mirrors");

        System.out.println("\nAfter checkout:");
        library.listAvailableItems();
    }
}
