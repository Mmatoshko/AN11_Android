package WrongPasswordException;

public class WrongPasswordException extends Exception {

    public void message() {
        System.err.println("Incorrect password");
    }
}
