package LW_5.Q2;

import java.util.ArrayList;

public class Degree {

    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int num) {
        this.numberOfStudents = num;
    }

    public void offerCourse(Course c) {
        coursesOffering.add(c);
    }

    public void withdrawCourse(Course c) {
        coursesOffering.remove(c);
    }

    public void listCoursesOffering() {
        System.out.println("Courses Offered in Degree: " + name);
        for (Course c : coursesOffering) {
            c.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Degree: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Courses Offered: " + coursesOffering.size());
        System.out.println("----------------------------------");
    }
}

