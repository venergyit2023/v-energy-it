package finans;

import finans.accounting.MainAccounting;
import finans.menu.AppSelector;
import finans.menu.LanguageSelector;
import finans.security.Login;

public class Main {

    public static void main(String[] args) {

        // Simple login system
        Login login = new Login();
        boolean isValidUser = login.userLogin();
        if (!isValidUser) {
            System.out.println("Call for help. Exit from app now.");
            System.exit(0);
        }
        int role = 1;

        // We are selecting app language
        LanguageSelector languageSelector = new LanguageSelector();
        int appLanguage = languageSelector.selectLanguage();

        // we are selecting app
        AppSelector appSelector = new AppSelector();
        int appNumber = appSelector.selectApp();
        appSelector.startApp(appNumber, appLanguage);

        // Accounting
        if (appNumber==1) {
            MainAccounting mainAccounting = new MainAccounting(isValidUser, role, appNumber, appLanguage);
            mainAccounting.getMainMenu();

        } else {
            System.out.println("End");
            System.exit(0);
        }

        System.exit(0);


    }

}
