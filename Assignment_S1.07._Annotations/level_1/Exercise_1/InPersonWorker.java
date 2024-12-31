public class InPersonWorker extends Worker {
    private static final double GASOLINE = 30;

    public InPersonWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + GASOLINE;
    }
}
