package LW_5.Q2;

public class UniversityManagementSystem {

    public static void main(String[] args) {

        Department d1 = new Department("Software Engineering");


        Degree deg1 = new Degree("Computer Science", 120);


        Course c1 = new Course("Object-Oriented Programming", "Compulsory", 80);


        Lecturer lec1 = new Lecturer("Dr. Nimal", "Senior Lecturer");


        Student s1 = new Student("Kamal Perera", "ST123", "2nd Year");


        d1.appointDepartmentHead(lec1);
        d1.addLecturer(lec1);
        d1.offerCourse(c1);

        lec1.addCourse(c1);
        c1.addLecturerInCharge(lec1);

        deg1.offerCourse(c1);
        c1.addDegreeBelongsTo(deg1);

        s1.registerDegree(deg1);
        s1.enrollCourse(c1);


        lec1.displayInfo();
        lec1.listCoursesTeaching();

        s1.displayInfo();
        s1.listCoursesEnrolled();

        d1.displayInfo();
        d1.displayDepartmentHeadInfo();

        deg1.displayInfo();
        deg1.listCoursesOffering();

        c1.displayInfo();
    }
}

