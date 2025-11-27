package LW_5.Q1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Borrowableitems> borrowableItemsList = new ArrayList<>();

    public void addLibraryItem(Borrowableitems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (Borrowableitems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book b = (Book) item;
                if (b.getTitle().equalsIgnoreCase(title)) {
                    if (b.isAvailable()) {
                        b.setAvailable(false);
                        System.out.println("Checked out: " + title);
                    } else {
                        System.out.println("Item already checked out.");
                    }
                    return;
                }
            }
        }
        System.out.println("Item not found in library.");
    }

    public void listAvailableItems() {
        System.out.println("Available Library Items:");
        for (Borrowableitems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book b = (Book) item;
                if (b.isAvailable()) {
                    b.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int availableCount = 0;
        for (Borrowableitems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book b = (Book) item;
                if (b.isAvailable()) {
                    availableCount++;
                }
            }
        }
        System.out.println("=== Library Information ===");
        System.out.println("Total Items: " + borrowableItemsList.size());
        System.out.println("Available Items: " + availableCount);
        System.out.println("============================");
    }
}

