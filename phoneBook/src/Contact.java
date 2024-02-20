import java.util.Scanner;

public class Contact
{
    private String name;
    private String phone;
    private String email;
    private String Address;

    public Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        Address = address;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact()
    {
        this("","","","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public static Contact getNewContact()
    {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("plz enter name of Contact");
        contact.setName(scanner.nextLine());

        System.out.println("plz enter phone of Contact");
        contact.setPhone(scanner.nextLine());

        System.out.println("plz enter email of Contact");
        contact.setEmail(scanner.nextLine());

        System.out.println("plz enter address of Contact");
        contact.setAddress(scanner.nextLine());

        return contact;

    }



}
