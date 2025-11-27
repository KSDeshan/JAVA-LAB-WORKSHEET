package LW_5.Q2;

public class Course {

    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;

    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }

    public String getEnrollType() { return enrollType; }
    public void setEnrollType(String e) { this.enrollType = e; }

    public int getNumberOfStudentsEnrolled() { return numberOfStudentsEnrolled; }
    public void setNumberOfStudentsEnrolled(int n) {
        this.numberOfStudentsEnrolled = n;
    }

    public void addLecturerInCharge(Lecturer l) {
        this.lecturerInCharge = l;
        l.addCourse(this);
    }

    public void removeLecturerInCharge() {
        this.lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree d) {
        this.degreeBelongsTo = d;
        d.offerCourse(this);
    }

    public void removeDegreeBelongsTo() {
        this.degreeBelongsTo = null;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Students Enrolled: " + numberOfStudentsEnrolled);
        if (lecturerInCharge != null)
            System.out.println("Lecturer In Charge: " + lecturerInCharge.getName());
        if (degreeBelongsTo != null)
            System.out.println("Degree Belongs To: " + degreeBelongsTo.getName());
        System.out.println("----------------------------------");
    }
}

