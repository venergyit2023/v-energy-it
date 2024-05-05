package finans.accounting;

import finans.accounting.menu.MainMenuAccountingEnglish;
import finans.accounting.menu.MainMenuAccountingNorwegian;
import finans.accounting.menu.MainMenuAccountingSerbian;
import finans.accounting.menu.SubMenuAccountingEnglish;

import java.util.Scanner;

public class MainAccounting {

    private boolean isValidUser;
    private int role;
    private int appNumber;
    private int appLanguage;

    public MainAccounting (boolean isValidUser, int role, int appNumber, int appLanguage) {
        this.isValidUser = isValidUser;
        this.role = role;
        this.appNumber = appNumber;
        this.appLanguage = appLanguage;
    }

    // User
    public boolean getIsValidUser() {
        return isValidUser;
    }

    public void setIsValidUser(boolean isValidUser) {
        this.isValidUser = isValidUser;
    }

    // Role
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    // Application
    public int getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(int appNumber) {
        this.appNumber = appNumber;
    }

    // Language
    public int getAppLanguage() {
        return appLanguage;
    }

    public void setAppLanguage(int appLanguage) {
        this.appLanguage = appLanguage;
    }



    public void getMainMenu(){

        if ((isValidUser==true) && (role==1) && (appNumber==1) && (appLanguage==1)) {

            MainMenuAccountingEnglish mainMenuAccountingEnglish = new MainMenuAccountingEnglish(1,"Continue", 5,"Exit", 2, "Change", 3, "New year", 4, "Tools");
            mainMenuAccountingEnglish.printMenuOnScreen();

        } else if ((isValidUser==true) && (role==1) && (appNumber==1) && (appLanguage ==2)) {

            MainMenuAccountingNorwegian mainMenuAccountingNorwegian = new MainMenuAccountingNorwegian(1,"Fortsette", 5,"Ut gang", 2, "Endring", 3, "Nyttår", 4, "Verktøy");
            mainMenuAccountingNorwegian.printMenuOnScreen();

        } else if ((isValidUser==true) && (role==1) && (appNumber==1) && (appLanguage ==3)) {

            MainMenuAccountingSerbian mainMenuAccountingSerbian = new MainMenuAccountingSerbian(1,"Rad", 5,"Izlaz", 2, "Izmene", 3, "Nova godina", 4, "Alati");
            mainMenuAccountingSerbian.printMenuOnScreen();

        } else {
            System.out.println("Exit");
        }

    }

    public void getSelectedOption(){
        Scanner inputMenuOption = new Scanner(System.in);
        int selectedOption = inputMenuOption.nextInt();

        if (selectedOption == 1) {

            if (appLanguage ==1) {
                SubMenuAccountingEnglish subMenuAccountingEnglish = new SubMenuAccountingEnglish(8,"Exit", 1,"Documents",2, "Syntetic codes",3,"Analytic codes",4,"Syntetic reports",5,"Analytic reports",6,"Submain report",7,"Others");
                subMenuAccountingEnglish.printMenuOnScreen();
            }

        } else if (selectedOption == 2) {
            System.out.println("This option is not implemented.");
        } else if (selectedOption == 3) {
            System.out.println("This option is not implemented.");
        } else if(selectedOption == 4) {
            System.out.println("This option is not implemented.");
        } else if(selectedOption == 5) {
            System.out.println("This option is not implemented.");
        } else {
            System.out.println("This option is not implemented.");
            selectedOption = 5;
        }
    }

}
