package training.initializer;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private static final List<Course> COURSES;

    static {
        List<Course> courses =  new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            courses.add(new Course("Course" + i));
        }
        COURSES = courses;
    }

    private String name;

    public String getName() {
        return name;
    }

    public Course(String name) {
        this.name = name;
    }
}
