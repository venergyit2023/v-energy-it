package finans.accounting.menu;

public class MainMenuAccounting {

    private int first;
    private String firstName;
    private int last;
    private String lastName;

    public MainMenuAccounting(int first, String firstName, int last, String lastName){
        this.first = first;
        this.firstName = firstName;
        this.last = last;
        this.lastName = lastName;
    }


    // First main menu option: Continue
    public int getMainMenuFirst() {
        return first;
    }

    public void setMainMenuFirst(int first) {
        this.first = first;
    }


    public String getMainMenuFirstName() {
        return firstName;
    }

    public void setMainMenuFirstName(String firstName) {
        this.firstName = firstName;
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
        return first + " - " + firstName + '\n' +
                last + " - " + lastName;
    }
}
