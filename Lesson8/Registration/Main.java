import WrongLoginException.WrongLoginException;
import WrongPasswordException.WrongPasswordException;


public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Registration registration = new Registration();
        registration.input();

    }
}
