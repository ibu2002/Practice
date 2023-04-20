
public class Ibu {
    public static void main(String[] args) {

        Person mohamed = new Person();
        mohamed.setFirstName("Mohamed");
        mohamed.setLastName("Ibrahim");
        mohamed.setAge((byte) 21);
        mohamed.setGender('M');

        mohamed.printFirstName();
        mohamed.printLastName();
        mohamed.printAge();
        mohamed.printGender();
    }
}

class Person {
    String firstName;
    String lastName;
    byte age;
    char gender;

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    void setAge(byte age) {
        this.age = (byte)(age);
    }
    void setGender(char gender) {
        this.gender = gender;
    }

    void printFirstName() {
        System.out.println("The First Name of the person is : "+firstName);
    }

    public void printLastName() {
        System.out.println("The Last Name of the person is : "+lastName);
    }
    public void printAge() {
        System.out.println("The Age of the Person is: "+age);
    }
    public void printGender() {
        System.out.println("The Gender of the person is: "+gender);
    }



}