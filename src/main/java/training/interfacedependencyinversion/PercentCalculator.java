package training.interfacedependencyinversion;

public class PercentCalculator implements BonusCalculator{

    @Override
    public int calculateBonus(int salary) {
        return (int)(salary * 1.25);
    }
}
