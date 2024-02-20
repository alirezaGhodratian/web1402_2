package tamrin_1;

public class person
{
    private String name;
    private  String address;

    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
