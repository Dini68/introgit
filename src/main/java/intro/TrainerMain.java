package intro;

public class TrainerMain {

    public static void main(String[] args) {

        Trainer trainer = new Trainer("XXXLutz");
        Trainer trainer1 = new Trainer("Joe", 1980);

        System.out.println(trainer.getName());
        System.out.println(trainer1.getName() + " " + trainer1.getYearOfBirth());
    }

}
