package introkotlin;

import training.aaa.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trainer {

    private String name;

    private List<String> courses;

    public Trainer(String name, List<String> courses) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hibás név.");
        }
        if (courses == null || courses.size() == 0) {
            throw new IllegalArgumentException("Nincs lista.");
        }
        this.name = name;
        this.courses = new ArrayList<>(courses);
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer("Kovács", Arrays.asList("C"));
        System.out.println(trainer.getCourses());
        trainer.addCourse("Java");
        System.out.println(trainer.getCourses());
    }
}
