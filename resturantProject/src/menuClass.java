import java.util.Scanner;

public class menuClass
{
    public static void main(String[] args) {
        menuClass m = new menuClass();
        m.showMenu();
    }

    private restManager manager;
    private Scanner scanner;
    public menuClass()
    {
        manager = new restManager();
        scanner = new Scanner(System.in);
    }

    public void showMenu()
    {
        int option = 0;

        do {
            System.out.println("==========Menu=========");
            System.out.println("1.add food");
            System.out.println("2.remove Food");
            System.out.println("3.search Food");
            System.out.println("4.add sefaresh");
            System.out.println("5.search sefaresh");
            System.out.println("6.print all food");
            System.out.println("7.print one food detail");
            System.out.println("8.print all sefaresh");
            System.out.println("9.mablaghe kile sefaresh");
            System.out.println("10.quit");

            option = Integer.valueOf(scanner.nextLine());
            processOption(option);
        }while(option!=10);


    }

    public void processOption(int option)
    {
        String name;
        switch (option)
        {
            case 1:
                manager.addNewFood();
                break;
            case 2:
                System.out.println("plz enter name of food to remove");
                name = scanner.nextLine();
                if(manager.removeFood(name)==true)
                    System.out.println("removed!!");
                else
                    System.out.println("not found!!");
                break;
            case 3:
                System.out.println("plz enter name of food to search");
                name = scanner.nextLine();
                System.out.println(manager.searchFood(name));
                break;
            case 4:
                manager.addNewSefaresh();
                break;
            case 5:
                System.out.println("plz enter id of table");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println(manager.searchInSefaresh(id));

                break;
            case 6:
                manager.printAllFoods();
                break;
            case 7:
                System.out.println("plz enter name of food to search");
                name = scanner.nextLine();
                System.out.println(manager.searchFood(name).toString());
                break;
            case 8:
                manager.printAllSefaresh();;
                break;
            case 9:
                manager.printAllSefareshPrice();
                break;
        }
    }


}
