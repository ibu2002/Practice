public class Reference {
    public static void main(String[] args) {
        Address address = new Address();
        address.doorNo = "8/1";
        address.street = "Nazar Street, Periyar Nagar";
        address.city = "Avadi";
        address.state = "Tamilnadu";
        address.pincode = 600071;

        System.out.println(address.doorNo);
        System.out.println(address.street);
        System.out.println(address.city);
        System.out.println(address.state);
        System.out.println(address.pincode);
    }
}
class Address {
    String doorNo;
    String street;
    String city;
    String state;
    int pincode;
}
