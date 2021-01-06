package training.methodoverloading;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;

    private int age;

    private List<Course> courses = new ArrayList<>();

    public void addCourse(String name) {
        courses.add(new Course(name));
    }

    public boolean addCourse(String name, int index) {
        courses.add(index, new Course(name));
        return false;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}
