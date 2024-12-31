public class NoGenericMethods {
    private Object arg1;
    private Object arg2;
    private Object arg3;

    public NoGenericMethods(Object arg1, Object arg2, Object arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public Object getArg1() {
        return arg1;
    }

    public Object getArg2() {
        return arg2;
    }

    public Object getArg3() {
        return arg3;
    }

    public static void main(String[] args) {
        // Example usage of NoGenericMethods
        NoGenericMethods obj = new NoGenericMethods("First", 123, true);
        
        // Print out the arguments
        System.out.println("Argument 1: " + obj.getArg1());
        System.out.println("Argument 2: " + obj.getArg2());
        System.out.println("Argument 3: " + obj.getArg3());
    }
}
