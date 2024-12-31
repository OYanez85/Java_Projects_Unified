public class OnlineWorker extends Worker {
    private static final double INTERNET_FLAT_RATE = 50;

    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public void oldInternetMethod() {
        System.out.println("This method is deprecated and should not be used.");
    }
}
