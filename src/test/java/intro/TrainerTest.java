package intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testGetYearOfBirth() {
        assertEquals(1980, new Trainer("Jane", 1980).getYearOfBirth());
    }
    @Test
    void testGetName() {
        assertEquals("Jane", new Trainer("Jane", 1980).getName());
    }
    @Test
    void testTrainerCreateWithName() {
        assertThrows(IllegalArgumentException.class, () -> new Trainer("", 1970));
        assertThrows(IllegalArgumentException.class, () -> new Trainer(null, 1970));
    }
    @Test
    void testTrainerCreateWithYear() {
        assertThrows(IllegalArgumentException.class, () -> new Trainer("Jack", 1170));
        assertThrows(IllegalArgumentException.class, () -> new Trainer("Jack", 2970));
    }
}