package training.inheritanceconstructor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainerTest {

    @Test
    public void testCreate() {
        List<Course> courses1 = new ArrayList<>();
        courses1.add(new Course("KD"));
        courses1.add(new Course("ST"));
        Trainer trainer = new Trainer(Arrays.asList(new Course("KH")));
    }
}
