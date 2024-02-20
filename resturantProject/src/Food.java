import java.util.Scanner;

public class Food
{
    private String foodName;
    private int foodPrice;
    private foodTypes foodType;
    private int monasebFor;

    public Food()
    {
        foodName ="";
        foodPrice = 0;
        monasebFor = 0;
        foodType = foodTypes.none;
    }

    public Food(String foodName, int foodPrice, foodTypes foodType, int monasebFor) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodType = foodType;
        this.monasebFor = monasebFor;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public foodTypes getFoodType() {
        return foodType;
    }

    public void setFoodType(foodTypes foodType) {
        this.foodType = foodType;
    }

    public int getMonasebFor() {
        return monasebFor;
    }

    public void setMonasebFor(int monasebFor) {
        this.monasebFor = monasebFor;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodType=" + foodType +
                ", monasebFor=" + monasebFor +
                '}';
    }

    public static Food getNewFood()
    {   Scanner scanner = new Scanner(System.in);
        Food f = new Food();
        System.out.println("plz enter food name:");
        f.setFoodName(scanner.nextLine());

        System.out.println("plz enter food price:");
        f.setFoodPrice(Integer.valueOf(scanner.nextLine()));

        System.out.println("plz enter food type (1->nooshidani,2->pishGhaza,3->ghazaAsli):");
        String ch = scanner.nextLine();
        switch (ch)
        {
            case "1":
                f.setFoodType(foodTypes.nooshidani);
                break;
            case "2":
                f.setFoodType(foodTypes.pishGhaza);
                break;
            case "3":
                f.setFoodType(foodTypes.ghazaAsli);
                break;
        }
        System.out.println("plz enter food sufficcent for:");
        f.setMonasebFor(Integer.valueOf(scanner.nextLine()));
        return f;
    }
}



enum foodTypes
{
    nooshidani,
    pishGhaza,
    ghazaAsli,
    none
}
