import java.util.Arrays;
import java.util.Scanner;

public class Book
{
    //tamrin2
    private String name;
    private Author[]authors;
    private double price;
    private int qty =0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add count of authors");
         int count =Integer.valueOf( scanner.nextLine());
        Author [] authors=new Author[count];

        for (int i = 0; i < authors.length; i++)
        {
            authors[i]=Author.GetAuthor();
        }

        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }


    public String getAuthorNames()
    {

        return Arrays.toString(authors);

    }

    public static Book getBook()
    {
        Book book =new Book();
        Scanner scanner = new Scanner(System.in);

        System.out.println("add name");
        String name =scanner.nextLine();
        book.setName(name);

        System.out.println("add price");
        Double price =Double.valueOf( scanner.nextLine());
        book.setPrice(price);

        System.out.println("add qty");
        int qty =Integer.valueOf( scanner.nextLine());
        book.setQty(qty);

        book.setAuthors();



        return book;



    }






}
