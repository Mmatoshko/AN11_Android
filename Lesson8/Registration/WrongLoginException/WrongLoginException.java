package WrongLoginException;

public class WrongLoginException extends Exception {
    public void message() {
        System.err.println("Incorrect login");
    }
}
