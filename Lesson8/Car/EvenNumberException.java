public class EvenNumberException extends Exception {
    public EvenNumberException(String name) {
        System.err.println("Car " + name + " didn't start");
    }
}
