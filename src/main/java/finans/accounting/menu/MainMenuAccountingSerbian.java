/**
 * 1-Rad (Continue)
 * 2-Izmena (Change)
 * 3-Otvaranje nove firme (baze) (New year)
 * 4-Alati za odrzavanje baze (Tools)
 * 5-Izlaz (Exit)
 */
package finans.accounting.menu;

public class MainMenuAccountingSerbian extends MainMenuAccounting {
    private int option2;
    private String name2;

    private int option3;
    private String name3;

    private int option4;
    private String name4;

    public MainMenuAccountingSerbian(int first, String firstName, int last, String lastName, int option2, String name2, int option3, String name3, int option4, String name4){

        super(first,firstName,last,lastName);

        this.option2 = option2;
        this.name2 = name2;

        this.option3 = option3;
        this.name3 = name3;

        this.option4 = option4;
        this.name4 = name4;
    }



    // 2-Change (Izmena)
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


    // 3-New year (Otvaranje nove firme (baze))
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




    // 4-Tools ("Alati" za odrzavanje baze)
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


    public void printMenuOnScreen(){
        System.out.println("Glavni meni za RACUNOVODSTVO - izbor: ");
        System.out.println(getMainMenuFirst() + " - "+ getMainMenuFirstName());
        System.out.println(getOption2() + " - " + getName2());
        System.out.println(getOption3() + " - " + getName3());
        System.out.println(getOption4() + " - " + getName4());
        System.out.println(getMainMenuLast() + " - "+ getMainMenuLastName());
    }


    @Override
    public String toString() {
        return super.toString() + '\n' +
                option2 + " - " + name2 + '\n' +
                option3 + " - " + name3 + '\n' +
                option4 + " - " + name4;
    }


}
