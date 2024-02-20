import java.util.ArrayList;
import java.util.Scanner;

public class Sefaresh
{
    private ArrayList<Food> foods;
    private int sefareshID;
    private static int totalSefarsh = 0;
    private int nafarat;
    private int mizNum;
    private int priceSefaresh;


    public Sefaresh(int nafarat, int mizNum)
    {
        foods = new ArrayList<>();
        totalSefarsh++;
        sefareshID = totalSefarsh;
        this.nafarat = nafarat;
        this.mizNum = mizNum;
    }

    public Sefaresh()
    {
        this(0,0);
    }
    public void addFood(Food food)
    {
        this.foods.add(food);
        priceSefaresh+= food.getFoodPrice();
    }


   /* public void addFood()
    {
        Food temp = Food.getNewFood();
        this.foods.add(temp);
        priceSefaresh+= temp.getFoodPrice();
    }
*/
    @Override
    public String toString() {
        return "Sefaresh{" +
                "foods=" + foods +
                ", sefareshID=" + sefareshID +
                ", nafarat=" + nafarat +
                ", mizNum=" + mizNum +
                ", priceSefaresh=" + priceSefaresh +
                '}';
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public int getSefareshID() {
        return sefareshID;
    }

    public void setSefareshID(int sefareshID) {
        this.sefareshID = sefareshID;
    }

    public static int getTotalSefarsh() {
        return totalSefarsh;
    }

    public static void setTotalSefarsh(int totalSefarsh) {
        Sefaresh.totalSefarsh = totalSefarsh;
    }

    public int getNafarat() {
        return nafarat;
    }

    public void setNafarat(int nafarat) {
        this.nafarat = nafarat;
    }

    public int getMizNum() {
        return mizNum;
    }

    public void setMizNum(int mizNum) {
        this.mizNum = mizNum;
    }

    public int getPriceSefaresh() {
        return priceSefaresh;
    }

    public void setPriceSefaresh(int priceSefaresh) {
        this.priceSefaresh = priceSefaresh;
    }

    public static Sefaresh getNewSefaresh()
    {
        Scanner scanner = new Scanner(System.in);
        Sefaresh s = new Sefaresh();
        System.out.println("plz enter miz:");
        s.setMizNum(Integer.valueOf(scanner.nextLine()));


        System.out.println("plz enter nafarat:");
        s.setNafarat(Integer.valueOf(scanner.nextLine()));

        return s;

    }



}
