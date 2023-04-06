public class Reference {

    public static void swap(String let1, String let2) {
        String temp = let1;

        System.out.println(let1);
        System.out.println(let2);

        let1 = let2;
        let2 = temp;

        System.out.println(let1);
        System.out.println(let2);
    }

    public static void function1(int x) {
        if (x>0) {
             System.out.println("your number is greater than zero");
        }else {
            System.out.println("your number is smaller than zero");
        }

    }


    public static void main(String[] args) {

        function1(10);
        function1(0);

        swap("Mohamed", "Ibrahim");

        //creating the object to the class Address
        Address address = new Address();
        address.doorNo = "8/1";
        address.street = "Nazar Street, Periyar Nagar";
        address.city = "Avadi";
        address.state = "Tamilnadu";
        address.pincode = 600071;
       
       //Printing the information
        System.out.println(address.doorNo);
        System.out.println(address.street);
        System.out.println(address.city);
        System.out.println(address.state);
        System.out.println(address.pincode);

        SmartPhone vivo = new SmartPhone();
        vivo.brand = "Vivo";
        vivo.model = "V17 Pro";
        vivo.price = 32_000;

        System.out.println(vivo.brand);
        System.out.println(vivo.model);
        System.out.println(vivo.price);

        SmartPhone oppo;

        new SmartPhone();

        oppo = new SmartPhone();

        oppo = vivo;

        System.out.println(oppo.price);

        oppo.brand ="Oppo";

        System.out.println(vivo.brand);


    }
}

// creating the class name called Address

class Address {
    String doorNo;
    String street;
    String city;
    String state;
    int pincode;
}

class SmartPhone {
    String brand;
    String model;
    double price;
}
