public class Reference {
    public static void main(String[] args) {
        Address address = new Address();
        System.out.println(address.name);
        System.out.println(address);
        address.doorNo = 20;
        address.street = "Nazar Street, Preiyar Nagar";
        address.city = "Avadi";
        address.state = "Tamilnadu";
        address.adres = address.doorNo + ", "+ address.street +", "+address.city+", "+address.state;
         System.out.println("The Address is : "+address.adres);   
        
    }
}
class Address {
    String name = "Mohamed";
    int doorNo;
    String street;
    String city;
    String state;
    String adres;
}
