import java.util.ArrayList;
import java.util.Scanner;

public class contactManager
{
    private ArrayList<Contact> contacts;
    private Scanner scanner;
    public contactManager()
    {
        scanner = new Scanner(System.in);
        contacts = new ArrayList<>();
    }

    public void addContact()
    {
        contacts.add(Contact.getNewContact());
    }

    public int searchByName()
    {
        System.out.println("plz enter name for search");
        String name = scanner.nextLine();

        for (int i = 0; i < contacts.size(); i++)
        {
            if(contacts.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    public int searchByName(String name)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if(contacts.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    public int searchByPhone()
    {
        System.out.println("plz enter phone for search");
        String phone = scanner.nextLine();

        return searchByPhone(phone);
    }

    public int searchByPhone(String phone)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if(contacts.get(i).getPhone().equals(phone))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(int index)
    {
        if(index<contacts.size())
        {
            contacts.remove(index);
            return true;
        }
        return false;
    }

    public boolean editContact(int index)
    {
        if(index<contacts.size())
        {
            contacts.set(index,Contact.getNewContact());
            return true;
        }
        return false;
    }

    public void showContact(int index)
    {
        System.out.println(contacts.get(index));
    }

}
