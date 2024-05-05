/**
 * 1-Rad (Continue)
 * 2-Lozinka (Password)
 * 3-Vlasnik licence (The Licence Owner)
 * 4-Saradnja (Cooperation)
 * 5-O programeru (Developer)
 * 6-Pomoc (Help)
 * 7-Izlaz (Exit)
 */
package finans.menu;

// Help: JAVA Core Programming: 8/9 (SA)
public class MainMenuSerbian extends MainMenu {

    private int option2;
    private String name2;

    private int option3;
    private String name3;

    private int option4;
    private String name4;

    private int option5;
    private String name5;

    private int option6;
    private String name6;

    public MainMenuSerbian(int first, String firstName, int last, String lastName, int option2, String name2, int option3, String name3, int option4, String name4, int option5, String name5, int option6, String name6){
        super(first,firstName,last,lastName);
        this.option2 = option2;
        this.name2 = name2;

        this.option3 = option3;
        this.name3 = name3;

        this.option4 = option4;
        this.name4 = name4;

        this.option5 = option5;
        this.name5 = name5;

        this.option6 = option6;
        this.name6 = name6;
    }



    // 2-Password
    public int getOption2() {
        return option2;
    }

    public void setOption2(int option2) {
        this.option2 = option2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }


    // 3-The Licence Owner
    public int getOption3() {
        return option3;
    }

    public void setOption3(int option3) {
        this.option3 = option3;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }




    // 4-Cooperation
    public int getOption4() {
        return option4;
    }

    public void setOption4(int option4) {
        this.option4 = option4;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }



    // 5-Developer
    public int getOption5() {
        return option5;
    }

    public void setOption5(int option5) {
        this.option5 = option5;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    // 6-Help
    public int getOption6() {
        return option6;
    }

    public void setOption6(int option6) {
        this.option6 = option6;
    }

    public String getName6() {
        return name6;
    }

    public void setName6(String name6) {
        this.name6 = name6;
    }

    public void printMenuOnScreen() {
        System.out.println("RACUNOVODSTVO - izbor: ");
        System.out.println(getMainMenuFirst() + " - " + getMainMenuFirstName());
        System.out.println(getOption2() + " - " + getName2());
        System.out.println(getOption3() + " - "+ getName3());
        System.out.println(getOption4() + " - " + getName4());
        System.out.println(getOption5() + " - " + getName5());
        System.out.println(getOption6() + " - " + getName6());
        System.out.println(getMainMenuLast() + " - " + getMainMenuLastName());
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                option2 + " - " + name2 + '\n' +
                option3 + " - " + name3 + '\n' +
                option4 + " - " + name4 + '\n' +
                option5 + " - " + name5 + '\n' +
                option6 + " - " + name6;
    }

}
