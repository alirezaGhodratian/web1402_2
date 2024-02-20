import java.util.Scanner;

public class Author
{
    //tamrin1
    private String name;
    private String email;
    private char gender;


    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }


    public static Author GetAuthor()
    {
        Scanner A =new Scanner(System.in);
        System.out.println("plz add name ");
        String name =A.nextLine();

        System.out.println("plz add email ");
        String email =A.nextLine();

        System.out.println("plz add gender ");
        String gender=A.nextLine();

        Author author=new Author(name , email , gender.charAt(0));


        return author;

    }



}
