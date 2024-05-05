package finans.menu;

import java.util.Scanner;

public class LanguageSelector {

    private int selectedAppLanguage;

    public LanguageSelector () {

    }

    public int selectLanguage() {

        // Choose language (default is English)
        Scanner mySelectedLanguage = new Scanner(System.in);
        System.out.println("Select language:");
        System.out.println("1 for English");
        System.out.println("2 for Norwegian");
        System.out.println("3 for Serbian");
        int selectedAppLanguage = mySelectedLanguage.nextInt();

        if (selectedAppLanguage == 1) {

            MainMenuEnglish mainMenuEnglish = new MainMenuEnglish(1,"Continue", 7,"Exit", 2, "Password", 3, "The Licence Owner", 4, "Cooperation", 5, "Developer", 6, "Help");
            mainMenuEnglish.printMenuOnScreen();

        } else if (selectedAppLanguage == 2) {

            MainMenuNorwegian mainMenuNorwegian = new MainMenuNorwegian(1,"Fortsette", 7,"Ut gang", 2, "Passord", 3, "Lisenseieren", 4, "Samarbeid", 5, "Utvikler", 6, "Hjelp");
            mainMenuNorwegian.printMenuOnScreen();

        } else if (selectedAppLanguage == 3) {

            MainMenuSerbian mainMenuSerbian = new MainMenuSerbian(1,"Rad", 7,"Izlaz", 2, "Lozinka", 3, "Vlasnik licence", 4, "Saradnja", 5, "O programeru", 6, "Pomoc");
            mainMenuSerbian.printMenuOnScreen();

        } else {
            System.out.println("Wrong choice ! Start application again.");
            System.out.println("End");
            System.exit(0);
        }



        return selectedAppLanguage;
    }



}
