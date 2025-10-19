package LW_3;

public class Q4 {
    public static void main(String[] args) {

        Lecturer lec = new Lecturer();
        lec.setLecturerName("Dr. Nimal Perera");
        lec.setCourseTeaching("Object Oriented Programming");

        Course c1 = new Course();
        c1.setCourseName("Object Oriented Programming");
        c1.setCourseCode("CS2103");
        c1.setLecturer(lec);

        Student st = new Student();
        st.setStudentName("Sandun Deshan");
        st.setDegreeName("BSc in Computer Science");
        st.setCourseFollowing(c1.getCourseName());

        System.out.println("=====** Course Registration Details **=====");
        System.out.println("Course Name : " + c1.getCourseName());
        System.out.println("Course Code : " + c1.getCourseCode());
        System.out.println("Lecturer Name : " + c1.getLecturer().getLecturerName());
        System.out.println("Teaching Course : " + c1.getLecturer().getCourseTeaching());
        System.out.println("---------------------------------------");
        System.out.println("Student Name : " + st.getStudentName());
        System.out.println("Degree Name : " + st.getDegreeName());
        System.out.println("Course Following : " + st.getCourseFollowing());
    }
}

class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

