package training.aaa;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends Human implements Work{

    private String name;

    private List<Course> courses = new ArrayList<>();

    public Trainer(int age, String name, List<Course> courses) {
        super(age);
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean doWork() {
        return false;
    }

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        Course course1 = new Course("Course1");
        courseList.add(course1);
        Trainer trainer = new Trainer(60, "John Doe", courseList);

        System.out.println(trainer instanceof Trainer);
        System.out.println(trainer instanceof Object);
        System.out.println(trainer instanceof Human);
        System.out.println(trainer instanceof Work);
    }
}
