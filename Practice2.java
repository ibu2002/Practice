public class Practice2 {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();

        laptop1.brand = "Dell";
        laptop1.model = "Insprion 5558";
        laptop1.processorType = "Intel";
        laptop1.ramSize = "8 GB";
        laptop1.romSize = "500 GB";
        laptop1.romType = "HDD";

        System.out.println("The Description of the Dell laptop");

        System.out.println("The brand of the laptop is " +laptop1.brand+".");
        System.out.println("The Model of the laptop is " +laptop1.model+".");
        System.out.println("The ProcessorType of the laptop is " +laptop1.processorType+".");
        System.out.println("The Ram Memory Size of the laptop is " +laptop1.ramSize+".");
        System.out.println("The Rom Memory Size of the laptop is " +laptop1.romSize+".");
        System.out.println("The Rom Memory Type of the laptop is " +laptop1.romType+".");


         Laptop laptop2 = new Laptop();

        laptop2.brand = "HP";
        laptop2.model = "Elitebook";
        laptop2.processorType = "AMD";
        laptop2.ramSize = "16 GB";
        laptop2.romSize = "1 TB";
        laptop2.romType = "SSD";


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("The Description of the HP laptop");

        System.out.println("The brand of the laptop is " +laptop2.brand+".");
        System.out.println("The Model of the laptop is " +laptop2.model+".");
        System.out.println("The ProcessorType of the laptop is " +laptop2.processorType+".");
        System.out.println("The Ram Memory Size of the laptop is " +laptop2.ramSize+".");
        System.out.println("The Rom Memory Size of the laptop is " +laptop2.romSize+".");
        System.out.println("The Rom Memory Type of the laptop is " +laptop2.romType+".");
   
   
        Attandance student1 = new Attandance();
        student1.studentName = "Ibrahim";
        student1.rollNo = 12101;
        student1.stuClass = "2023";
        student1.isPresent = true;


        System.out.println(" ");
        System.out.println(" ");

        System.out.println("the name of the student is :"+student1.studentName+".");
        System.out.println("the Roll Number of the student is :"+student1.rollNo+".");
        System.out.println("the Class of the student is :"+student1.stuClass+".");
        System.out.println("the name of the student is :"+student1.studentName+".");
        System.out.println("today the student is present :"+student1.isPresent+".");

        Attandance student2 = new Attandance();
        student2.studentName = "Mohamed";
        student2.rollNo = 12102;
        student2.stuClass = "2023";
        student2.isPresent = false;


        System.out.println(" ");
        System.out.println(" ");

        System.out.println("the name of the student is :"+student2.studentName+".");
        System.out.println("the Roll Number of the student is :"+student2.rollNo+".");
        System.out.println("the Class of the student is :"+student2.stuClass+".");
        System.out.println("the name of the student is :"+student2.studentName+".");
        System.out.println("today the student is present :"+student2.isPresent+".");



    }
}

class Laptop {
    String brand;
    String model;
    String processorType;
    String ramSize;
    String romSize;
    String romType;
}

class Attandance {
    String studentName;
    int rollNo;
    String stuClass;
    boolean isPresent;
}