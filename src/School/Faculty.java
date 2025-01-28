package School;

import java.util.ArrayList;

public class Faculty {
    private final ArrayList<Student> students;
    private final ArrayList<Course> courses;

    public Faculty(int id, String name) {
        super(id, name);
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public Faculty(Faculty other) {
        super(other)

        courses = new ArrayList<Course>();
        for (Course c : other.courses) {
            courses.add(new Course(c));
        }
        students = new ArrayList<students>();
        for (Course s : other.students) {
            students.add(new Course(s));
        }
    }

    public Faculty clone() {
        return new Faculty(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
    }

}
