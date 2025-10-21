package LW_3;

import java.util.ArrayList;


abstract class BorrowableItems {
    public abstract void displayInfo();
}

class Book extends BorrowableItems {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("ISBN       : " + ISBN);
        System.out.println("Available  : " + (available ? "Yes" : "No"));
        System.out.println("--------------------------------------");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student1 extends Person {
    public Student1 (String name) {
        super(name);
    }
}

class Library {
    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<BorrowableItems>();
    }

    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book b = (Book) item;
                if (b.getTitle().equalsIgnoreCase(title)) {
                    if (b.isAvailable()) {
                        b.setAvailable(false);
                        System.out.println("Book \"" + title + "\" checked out successfully!");
                    } else {
                        System.out.println("Book \"" + title + "\" is already checked out!");
                    }
                    return;
                }
            }
        }
        System.out.println("Book \"" + title + "\" not found in the library!");
    }

    public void listAvailableItems() {
        System.out.println("Available Books in the Library:");
        System.out.println("--------------------------------------");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book b = (Book) item;
                if (b.isAvailable()) {
                    b.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int total = borrowableItemsList.size();
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                if (((Book) item).isAvailable()) {
                    availableCount++;
                }
            }
        }
        System.out.println("=====* Library Information *=====");
        System.out.println("Total Books     : " + total);
        System.out.println("Available Books : " + availableCount);
        System.out.println("================================");
    }
}


public class Q5 {
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

        library.checkoutItem("Island of a Thousand Mirrors");

        library.displayLibraryInfo();
        library.listAvailableItems();
    }
}
