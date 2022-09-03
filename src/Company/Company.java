package Company;

/**
 *
 * @author 4soarj03
 */
public class Company {

    Dog[] numbEnclosures = new Dog[10];

    public Company() {
    }

    public boolean addDog(Dog dogIn) {
        for (int i = 0; i < numbEnclosures.length; i++) {
            if (numbEnclosures[i] == null) {
                numbEnclosures[i] = dogIn;
                return true;
            }
        }
        System.out.println("Dog was unsucssefully added.");
        return false;
    }

    public int getnumberofdogs() {
        int numberdogs = 0;
        for (int i = 0; i < numbEnclosures.length; i++) {
            if (numbEnclosures[i] != null) {
                numberdogs++;
            }
        }
        System.out.println("Total of dogs: ");
        return numberdogs;
    }

    public String enclosures() {
        String ret = "";
        for (int i = 0; i < numbEnclosures.length; i++) {
            if (numbEnclosures[i] != null) {

                ret += "\nEnclosure " + i + " Holds Dog:" + numbEnclosures[i].getName() + "\n" + numbEnclosures[i].toString() + "\n";
            } else {
                ret += "\nEnclosure " + i + " is empty\n";
            }
        }
        return ret;
    }

    public boolean removeDog(int numberEnclosure) {
        for (int i = 0; i < numbEnclosures.length; i++) {
            if (numbEnclosures[i] != null) {
                if (i == numberEnclosure) {
                    numbEnclosures[i] = null;
                    System.out.println("Dog removed!");
                    return true;
                }

            }
        }
        System.out.println("Dog not found!");
        return false;
    }

    public String price(int enclosurenumber) {
        int calc = 0;
        int calc2=1;
        String a = "";
        for (int i = 0; i < numbEnclosures.length; i++) {
            if (numbEnclosures[i] != null) {
                if (enclosurenumber == i) {
                    calc2+=i;
                    calc += numbEnclosures[i].getDays()*15*calc2;
                    a += calc;
                    System.out.println("Total price is: " + a);
                } 
                else if(numbEnclosures[i] == null){
                    System.out.println("Enclosure not found!");
                }
            }
        }
        return a;
    }
}
