package training.course;

import training.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private  String name;

    private List<Course> courses = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void addCourse(String name) {
        courses.add(new Course(name));
    }

    public Course findCourseByName(String name) {
        for (Course c: courses) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Not found with name: " + name);
    }

    public List<Course> findCoursesBetween(char start, char end) {
        List<Course> findCourses = new ArrayList<>();
        for (Course c: courses) {
            if (c.getName().toLowerCase().charAt(0) >= start &&
               (c.getName().toLowerCase().charAt(0) <= end)) {
                findCourses.add(c);
            }
        }
        return findCourses;
    }
}
