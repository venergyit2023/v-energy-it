package finans.menu;

import java.util.Scanner;

public class AppSelector {

    private int selectedApp;

    public AppSelector () {

    }

    public int selectApp() {

        App app = new App();
        int defApp = app.getAppNumber();
        if (defApp == 1) {
            System.out.println("Selected is app Accounting (default).");
        }

        Scanner inputApp = new Scanner(System.in);
        System.out.println("Select app: 1-Accounting, 2-Wholesaling, 3-Retail, 4-Inventory, 5-Payroll");
        int selectedApp = inputApp.nextInt();

        if (selectedApp == 1) {
            System.out.println("Selected app is 1-Accounting.");
        } else if (selectedApp == 2) {
            System.out.println("Selected app is 2-Wholesaling.");
        } else if (selectedApp == 3) {
            System.out.println("Selected app is 3-Retail.");
        } else if(selectedApp == 4) {
            System.out.println("Selected app is 4-Inventory.");
        } else if (selectedApp == 5) {
            System.out.println("Selected app is 5-Payroll.");
        } else {
            System.out.println("Selected app does not exist. Default app Accounting is set.");
            selectedApp = 1;
        }

        app.setAppNumber(selectedApp);
        int test = app.getAppNumber();
        System.out.println("App: " + test);

        return selectedApp;
    }

    public void startApp(int app, int appLanguage) {

        System.out.println("App number is: " + app);
        if (app==1 && appLanguage==1) {
            CreateAccountingMenu createAccountingMenu = new CreateAccountingMenu();
            createAccountingMenu.createEnglishMenu();
        } else {
            System.out.println("Selected app and language are not supported. Please select again.");
        }


    }


}
