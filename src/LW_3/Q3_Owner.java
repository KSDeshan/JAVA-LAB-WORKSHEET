package LW_3;

public class Q3_Owner {
    private String ownerName;
    private String phoneNo;

    public Q3_Owner() {
        ownerName = "Unknown";
        phoneNo = "Not Available";
    }

    public Q3_Owner(String name, String num) {
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
