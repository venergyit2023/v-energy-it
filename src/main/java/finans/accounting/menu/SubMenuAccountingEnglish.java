/**
 * 1-Documents (Nalozi)
 * 2-Syntetic codes (Sintetika (kontni okvir))
 * 3-Analytic codes (Analitika (kontni okvir))
 * 4-Syntetic reports (Izvestaji sintetike)
 * 5-Analytic reports (Izvestaji analitike)
 * 6-Submain report (Zakljucni list)
 * 7-Others (Ostalo)
 * 8-Exit
 */
package finans.accounting.menu;

public class SubMenuAccountingEnglish extends SubMenuAccounting {

    private int option1;
    private String name1;

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

    private int option7;
    private String name7;

    public SubMenuAccountingEnglish(int last, String lastName, int option1, String name1, int option2, String name2, int option3, String name3, int option4, String name4, int option5, String name5, int option6, String name6, int option7, String name7){

        super(last,lastName);

        this.option1 = option1;
        this.name1 = name1;

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

        this.option7 = option7;
        this.name7 = name7;
    }

    // 1-Documents
    public int getOption1() {
        return option1;
    }

    public void setOption1(int option1) {
        this.option1 = option1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }



    // 2-Syntetic codes
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


    // 3-Analytic codes
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




    // 4-Syntetic reports
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


    // 5-Analytic reports
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


    // 6-Submain report
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


    // 7-Others
    public int getOption7() {
        return option7;
    }

    public void setOption7(int option7) {
        this.option7 = option7;
    }

    public String getName7() {
        return name7;
    }

    public void setName7(String name7) {
        this.name7 = name7;
    }


    public void printMenuOnScreen(){
        System.out.println("Accounting Menu - please select: ");
        System.out.println(getOption1() + " - " + getName1());
        System.out.println(getOption2() + " - " + getName2());
        System.out.println(getOption3() + " - " + getName3());
        System.out.println(getOption4() + " - " + getName4());
        System.out.println(getOption5() + " - " + getName5());
        System.out.println(getOption6() + " - " + getName6());
        System.out.println(getOption7() + " - " + getName7());
        System.out.println(getMainMenuLast() + " - "+ getMainMenuLastName());
    }


    @Override
    public String toString() {
        return super.toString() + '\n' +
                option1 + " - " + name1 + '\n' +
                option2 + " - " + name2 + '\n' +
                option3 + " - " + name3 + '\n' +
                option4 + " - " + name4 + '\n' +
                option5 + " - " + name5 + '\n' +
                option6 + " - " + name6 + '\n' +
                option7 + " - " + name7;
    }
}
