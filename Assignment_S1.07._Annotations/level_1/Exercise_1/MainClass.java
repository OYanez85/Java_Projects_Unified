public class MainClass {
    public static void main(String[] args) {
        Worker onlineWorker = new OnlineWorker("Alice", "Smith", 20);
        Worker inPersonWorker = new InPersonWorker("John", "Doe", 15);

        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(160));
        System.out.println("In-person worker salary: " + inPersonWorker.calculateSalary(160));
    }
}
