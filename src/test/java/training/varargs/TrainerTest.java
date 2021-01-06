package training.varargs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testAddCourse() {
        Trainer trainer = new Trainer("John Doe");
        trainer.addCourses("C1", "C2");

        assertEquals(2, trainer.getCourses().size());
    }
}
