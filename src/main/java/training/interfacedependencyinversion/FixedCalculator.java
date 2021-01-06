package training.interfacedependencyinversion;

public class FixedCalculator implements BonusCalculator{

    @Override
    public int calculateBonus(int salary) {
        return salary + 10000;
    }
}
