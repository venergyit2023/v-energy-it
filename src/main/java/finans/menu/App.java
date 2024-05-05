package finans.menu;

public class App {

    private int appNumber = 1; //Default app is accounting, 2-Wholesaling, 3-Retail, 4-Inventory, 5-Payroll

    private String appName;

    public App() {

    }

    public int getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(int appNumber) {
        this.appNumber = appNumber;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

}
