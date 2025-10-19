package LW_3;

public class Q3_Bicycle {
    private Q3_Owner owner;

    public Q3_Bicycle() {
        owner = new Q3_Owner();
    }

    public Q3_Bicycle(String name, String num) {
        owner = new Q3_Owner(name, num);
    }

    public Q3_Owner getOwner() {
        return owner;
    }

    public void setOwner(Q3_Owner o) {
        owner = o;
    }

    public void displayDetails() {
        System.out.println("Owner Name: " + owner.getOwnerName());
        System.out.println("Phone No: " + owner.getPhoneNo());
    }
}
