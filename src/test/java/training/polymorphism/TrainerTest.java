package training.polymorphism;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {



    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        assertEquals(true, trainer instanceof Trainer);
        assertEquals(true, trainer instanceof Human);
        assertEquals(true, trainer instanceof Object);
        assertEquals(true, trainer instanceof HasName);

        Object object = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertEquals(true, object instanceof Trainer);
        assertEquals(true, object instanceof Human);
        assertEquals(true, object instanceof Object);
        assertEquals(true, object instanceof HasName);

        Human human = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertEquals(true, human instanceof Trainer);
        assertEquals(true, human instanceof Human);
        assertEquals(true, human instanceof Object);
        assertEquals(true, human instanceof HasName);

        HasName hasName = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertEquals(true, hasName instanceof Trainer);
        assertEquals(true, hasName instanceof Human);
        assertEquals(true, hasName instanceof Object);
        assertEquals(true, hasName instanceof HasName);

    }
    @Test
    public void testConvert() {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        Human human = trainer;
        Object object = trainer;
        HasName hasName = trainer;

    }

    @Test
    public  void testExplicitConvert() {
        Object object = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        Trainer trainer = (Trainer) object;

    }
    @Test
    public  void testExplicitConvert2() {
        Human human = new Human("John Doe");
        Trainer trainer = (Trainer) human;

    }

}
