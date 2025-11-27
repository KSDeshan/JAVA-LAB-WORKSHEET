package LW_5.Q2;

import java.util.ArrayList;

public class Student extends Person {

    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo() {
        if (degree != null) degree.displayInfo();
        else System.out.println("No degree registered.");
    }

    public void enrollCourse(Course c) {
        coursesEnrolled.add(c);
    }

    public void unenrollCourse(Course c) {
        coursesEnrolled.remove(c);
    }

    public void listCoursesEnrolled() {
        System.out.println(getName() + " – Courses Enrolled:");
        for (Course c : coursesEnrolled) {
            c.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        if (degree != null)
            System.out.println("Degree: " + degree.getName());
        System.out.println("----------------------------------");
    }
}
