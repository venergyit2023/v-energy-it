package finans.security;

import java.util.Scanner;

public class Login {

    private String userName;
    private String passWord;
    boolean validUser;

    public Login() {

    }


    public boolean userLogin() {

        Scanner userName = new Scanner(System.in);
        System.out.println("Enter username");
        String enteredUserName = userName.nextLine();

        Scanner passWord = new Scanner(System.in);
        System.out.println("Enter password");
        String enteredPassWord = passWord.nextLine();

        User user = new User();
        String userNameCheck = user.getUserName();
        String userPassWordCheck = user.getPassWord();

        if (enteredUserName.equals(userNameCheck) && enteredPassWord.equals(userPassWordCheck)) {
            validUser = true;
        } else {
            validUser = false;
        }
        return validUser;
    }

}
