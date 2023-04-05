public class Ref {
    public static void main(String[] args){
        
        car car1 = new car();
        student student1 = new student();
        employee employee1 = new employee();

        car car2 = new car();
        student student2 = new student();
        employee employee2 = new employee();

        car car3 = new car();
        student student3 = new student();
        employee employee3 = new employee();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        

    }
}

class car {
    String carName;
    String carModel;
    String carType;
    String carColor;
    int noOfWheels;
}
class student {
    String stuName;
    String stuRollNo;
    String stuClass;
    String StuSection;
    char StuGender;

}
class employee {
    String empName;
    String empType;
    String empId;
    double empSalary;
    String empShift;
}