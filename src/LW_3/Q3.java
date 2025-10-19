package LW_3;

public class Q3 {
    public static void main(String[] args) {

        Bicycle b1 = new Bicycle();
        System.out.println("Bicycle 1 Details:");
        b1.displayDetails();

        Bicycle b2 = new Bicycle("Sandun", "0712345678");
        System.out.println("\nBicycle 2 Details:");
        b2.displayDetails();

        Owner newOwner = new Owner("Kamal", "0771234567");
        b1.setOwner(newOwner);

        System.out.println("\nUpdated Bicycle 1 Details:");
        b1.displayDetails();
    }
}

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner() {
        ownerName = "Unknown";
        phoneNo = "Not Available";
    }

    public Owner(String name, String num) {
        ownerName = name;
        phoneNo = num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        phoneNo = num;
    }
}

class Bicycle {
    private Owner owner;

    public Bicycle() {
        owner = new Owner();
    }

    public Bicycle(String name, String num) {
        owner = new Owner(name, num);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner o) {
        owner = o;
    }

    public void displayDetails() {
        System.out.println("Owner Name: " + owner.getOwnerName());
        System.out.println("Phone No: " + owner.getPhoneNo());
    }
}

