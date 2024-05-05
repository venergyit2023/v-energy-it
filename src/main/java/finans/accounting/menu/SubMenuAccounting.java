package finans.accounting.menu;

public class SubMenuAccounting {

    private int last;
    private String lastName;

    public SubMenuAccounting(int last, String lastName){
        this.last = last;
        this.lastName = lastName;
    }


    // Last main menu option: Exit
    public int getMainMenuLast() {
        return last;
    }

    public void setMainMenuLast(int last) {
        this.last = last;
    }

    public String getMainMenuLastName() {
        return lastName;
    }

    public void setMainMenuLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return last + " - " + lastName;
    }

}
