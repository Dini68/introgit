package intro;

public class Trainer {

    private String name;

    private int yearOfBirth;

    public Trainer(String name, int yearOfBirth) {
        this(name);
        if (yearOfBirth < 1900 || yearOfBirth > 2021) {
            throw new IllegalArgumentException("Wrong year");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public Trainer(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Wrong name");
        }
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

}
