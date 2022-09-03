package Company;

/**
 *
 * @author 4soarj03
 */
import java.util.Scanner;

public class ABCDEEE {

    public static void main(String[] args) {
        Company c1 = new Company();
        boolean run = true;
        while (run == true) {
            System.out.println("Choose one of the following options:\n" + "1: Add a new dog\n" + "2: Get total of dogs\n" + "3: Remove a dog\n" + "4: Enclosures information\n" + "5: Check Reservation price\n" + "6: Exit");
            Scanner scanIn = new Scanner(System.in);
            int optionIn = Integer.parseInt(scanIn.nextLine());
            if (optionIn == 1) {
                System.out.println("Enter the name of the dog");
                String dogname = scanIn.nextLine();
                System.out.println("Enter the owner name");
                String ownername = scanIn.nextLine();
                System.out.println("Enter the gender of the dog");
                String genderIn = scanIn.nextLine();
                System.out.println("Enter the breed of the dog");
                String breedIn = scanIn.nextLine();
                boolean check = true;
                int ageIn =0;
                do{
                System.out.println("Enter the age of the dog");
                ageIn = scanIn.nextInt();
                scanIn.nextLine();
                if(ageIn>0 && ageIn<20){
                    check=false;
                }
                }while (check);
                
                System.out.println("Enter the number of days");
                int daysIn = Integer.parseInt(scanIn.nextLine());
                System.out.println("Enter additional notes");
                String notesIn = scanIn.nextLine();
                Dog dog = new Dog(dogname, ownername, genderIn, breedIn, ageIn, daysIn, notesIn);
                c1.addDog(dog);
            } else if (optionIn == 2) {
                c1.getnumberofdogs();
            } else if (optionIn == 3) {
                System.out.println("Enter the enclosure number");
                int numberEnclosure = Integer.parseInt(scanIn.nextLine());
                c1.removeDog(numberEnclosure);
            } else if (optionIn == 4) {
                System.out.println(c1.enclosures());
            } else if (optionIn == 5) {
                System.out.println("Enter the enclosure number");
                int numberEnclosure = Integer.parseInt(scanIn.nextLine());
                c1.price(numberEnclosure);
            } else if (optionIn == 6) {
                break;
            }
        }
    }

}
