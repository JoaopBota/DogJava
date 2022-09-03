package Company;

/**
 *
 * @author 4soarj03
 */
public class Dog {

    private int age;
    private String name;
    private String owner;
    private String gender;
    private String breed;
    private String notes;
    private int days;

    public Dog(String nameIn, String ownerIn, String genderIn, String breedname, int age1, int daysin, String notesin) {
        age = age1;
        name = nameIn;
        owner = ownerIn;
        gender = genderIn;
        breed = breedname;
        days = daysin;
        notes = notesin;
    }

    public int getDays() {
        return days;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Dog{" + "Age: " + age + ", Name: " + name + ", Owner: " + owner + ", Gender: " + gender + ", Breed: " + breed + ", Additional Notes: " + notes + ", Days: " + days + '}';
    }

}
