package LW_3;

public class Q3_Main {
    public static void main(String[] args) {
        Q3_Bicycle b1 = new Q3_Bicycle();
        System.out.println("Bicycle 1 Details:");
        b1.displayDetails();

        Q3_Bicycle b2 = new Q3_Bicycle("Sandun", "0712345678");
        System.out.println("\nBicycle 2 Details:");
        b2.displayDetails();

        Q3_Owner newOwner = new Q3_Owner("Kamal", "0771234567");
        b1.setOwner(newOwner);

        System.out.println("\nUpdated Bicycle 1 Details:");
        b1.displayDetails();
    }
}
