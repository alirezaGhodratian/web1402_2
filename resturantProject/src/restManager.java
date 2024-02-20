import java.util.ArrayList;
import java.util.Scanner;

public class restManager
{
    private ArrayList<Food> restFoods;
    private ArrayList<Sefaresh> restSefaresh;

    public void addNewFood()
    {
        restFoods.add(Food.getNewFood());
    }

    public restManager()
    {
        restFoods = new ArrayList<>();
        restSefaresh = new ArrayList<>();
    }

    public void addNewSefaresh()
    {
        //restSefaresh.add(Sefaresh.getNewSefaresh());
        Sefaresh temp =Sefaresh.getNewSefaresh();
        String name = "";
        do {
            System.out.println("plz enter name of yout food or q to quit!");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
            Food f = searchFood(name);
            if(f !=null)
                temp.addFood(f);
        }while(!name.equals("q"));
        restSefaresh.add(temp);
    }

    public Sefaresh searchInSefaresh(int id)
    {
        for (int i = 0; i < restSefaresh.size(); i++)
        {
            if(restSefaresh.get(i).getSefareshID() == id)
            {
                return restSefaresh.get(i);
            }
        }
        return null;
    }

    public void printAllSefaresh()
    {
        for (Sefaresh s: restSefaresh)
        {
            System.out.println(s);
        }
    }

    public void printAllFoods()
    {
        for (Food f: restFoods)
        {
            System.out.println(f);
        }
    }

    public void printOneFood(String name)
    {
        Food f = searchFood(name);
        if(f!=null)
        {
            System.out.println(f);
        }
    }

    public void printAllSefareshPrice()
    {
        double all = 0;
        for (Sefaresh s: restSefaresh)
        {
            all+=s.getPriceSefaresh();
        }
        System.out.println("all sefaresh : " + all);
    }


    public Food searchFood(String name)
    {
        for (Food food: restFoods)
        {
            if(food.getFoodName().equals(name))
            {
                return food;
            }
        }
        return null;
    }

    public boolean removeFood(String name)
    {
        Food f = searchFood(name);
        if(f!=null)
        {
            restFoods.remove(f);
            return true;
        }
        return false;
    }

}
