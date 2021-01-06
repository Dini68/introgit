package training.interfacedependencyinversion;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee(10000, new PercentCalculator());
        System.out.println(employee.getBonus());

        Employee anotheremployee = new Employee(10000, new FixedCalculator());
        System.out.println(anotheremployee.getBonus());
    }
}
