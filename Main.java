/**
 * Main
 */
public class Main {

    int add(int number1, int number2) {
        // number1 = 20;
        // number2 = 30;
        return number1 + number2;
    }

    String fullName(String firstName, String middleName, String lastName) {
        // firstName = "Mohamed";
        // middleName = "Ibrahim";
        // lastName = "A";

        return firstName + " " + middleName + " " + lastName;

    }

    public static void main(String[] args) {

        Main addition = new Main();
        System.out.println(addition.add(40, 50));

        Main fName = new Main();
        System.out.println(fName.fullName("Mohamed", "Ibrahim", "A"));

        int multiply = Main.multi(20, 9);
        System.out.println(multiply);
        
        double Divide = Main.div(10, 3);
        System.out.println(Divide);
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;

    }

    public static double div(int a, double b) {
        return a / b;

    }

}