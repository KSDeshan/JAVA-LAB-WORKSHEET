package LW_5.Q2;

import java.util.ArrayList;

public class Lecturer extends Person {

    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
        if (department != null) {
            System.out.println("Department: " + department.getName());
        }
        System.out.println("Courses Teaching: " + coursesTeaching.size());
        System.out.println("----------------------------------");
    }

    public void displayDepartmentInfo() {
        if (department != null)
            department.displayInfo();
        else
            System.out.println("No department assigned.");
    }

    public void addCourse(Course c) {
        coursesTeaching.add(c);
    }

    public void removeCourse(Course c) {
        coursesTeaching.remove(c);
    }

    public void listCoursesTeaching() {
        System.out.println("Courses taught by " + getName() + ":");
        for (Course c : coursesTeaching) {
            c.displayInfo();
        }
    }
}
