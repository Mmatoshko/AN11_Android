import WrongLoginException.WrongLoginException;
import WrongPasswordException.WrongPasswordException;

import java.util.Objects;
import java.util.Scanner;

public class Registration {
    /*private String login;
    private String password;
    private String confirmPassword;

    public Registration(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }*/

    protected void input() throws WrongLoginException, WrongPasswordException {
        System.out.println("Input login");
        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        System.out.println("Input password");
        String password = in.nextLine();
        System.out.println("Repeat the password");
        String confirmPassword = in.nextLine();
        if (check(login, password, confirmPassword) == true) {
            System.out.println("Success");
        }
    }

    static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int error = 0;
        try {
            if (login.length() > 20) {
                error++;
                throw new WrongLoginException();
            }

        } catch (WrongLoginException e) {
            e.message();
        } finally {
            try {
                if (password.length() > 20 || !Objects.equals(password, confirmPassword)) {
                    error++;
                    throw new WrongPasswordException();
                }
            } catch (WrongPasswordException e) {
                e.message();
            }
        }
        if (error == 0) {
            return true;
        } else {
            return false;
        }
    }
}
