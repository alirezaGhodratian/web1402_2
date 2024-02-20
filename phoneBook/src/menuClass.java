import java.util.Scanner;

public class menuClass
{
    private contactManager manager;
    private Scanner scanner = new Scanner(System.in);
    public menuClass()
    {
        manager = new contactManager();
    }

    public void showMenu()
    {

        String choice = "";


        do {
            System.out.println("-------------phone book-------------");
            System.out.println("1.add a new contact");
            System.out.println("2.remove a contact");
            System.out.println("3.search a contact by name");
            System.out.println("4.search a contact by phone");
            System.out.println("5.show info of a contact");
            System.out.println("6.edit a contact");
            System.out.println("0. quit program");

            choice = scanner.nextLine();
            processChoice(choice);

        }while(!choice.equals("0"));

    }

    public void processChoice(String choice)
    {

        switch (choice)
        {
            case "1":
                manager.addContact();
                break;
            case "2":
                System.out.println("enter index of remove contact");
                int index = Integer.valueOf(scanner.nextLine());
                if (manager.removeContact(index) == true)
                    System.out.println("removed");
                else
                    System.out.println("not removed");
                break;
            case "3":
                System.out.println(manager.searchByName());
                break;
            case "4":
                System.out.println(manager.searchByPhone());
                break;
            case "5":
                System.out.println("enter index of show a contact");
                index = Integer.valueOf(scanner.nextLine());
                manager.showContact(index);
                break;
            case "6":
                System.out.println("enter index of edit contact");
                index = Integer.valueOf(scanner.nextLine());
                if (manager.editContact(index) == true)
                    System.out.println("edited");
                else
                    System.out.println("not editted");
                break;

        }
    }


}
