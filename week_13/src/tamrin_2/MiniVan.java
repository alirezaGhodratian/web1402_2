package tamrin_2;

public class MiniVan extends vehicle
{
    private int numberOfSeats;
    private boolean Set_Air_Condition_ON;

    private boolean hasAutoDoor;

    public MiniVan() {
    }

    public MiniVan(int numberOfSeats, boolean set_Cir_Condition_ON, boolean hasAutoDoor) {
        this.numberOfSeats = numberOfSeats;
        Set_Air_Condition_ON = set_Cir_Condition_ON;
        this.hasAutoDoor = hasAutoDoor;
    }

    public MiniVan(int gasolinePrice, int dieselPrice, String modelName, String company, String owner, String engineType, double tankSize, double fuelConsumption, int numberOfSeats, boolean set_Cir_Condition_ON, boolean hasAutoDoor) {
        super(gasolinePrice, dieselPrice, modelName, company, owner, engineType, tankSize, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
        Set_Air_Condition_ON = set_Cir_Condition_ON;
        this.hasAutoDoor = hasAutoDoor;
    }

    public MiniVan(int gasolinePrice, int dieselPrice) {
        super(gasolinePrice, dieselPrice);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isSet_Cir_Condition_ON() {
        return Set_Air_Condition_ON;
    }

    public void setSet_Cir_Condition_ON(boolean set_Cir_Condition_ON) {
        Set_Air_Condition_ON = set_Cir_Condition_ON;
    }

    public boolean isHasAutoDoor() {
        return hasAutoDoor;
    }

    public void setHasAutoDoor(boolean hasAutoDoor) {
        this.hasAutoDoor = hasAutoDoor;
    }

    @Override
    public String toString() {
        return "MiniVan{" + super.toString() +
                "numberOfSeats=" + numberOfSeats +
                ", Set_Cir_Condition_ON=" + Set_Air_Condition_ON +
                ", hasAutoDoor=" + hasAutoDoor +
                '}';
    }

    @Override
    public void cost_for_100_km() {
        System.out.println("gasolinePrice = " +super.getGasolinePrice());
        System.out.println("dieselPrice = " +super.getDieselPrice());
    }

    @Override
    public boolean set_air_condition_ON() {
        if (Set_Air_Condition_ON == true)
        {
            System.out.println("on");
            return true;


        }
        else
        {
            System.out.println("off");
            return false;

        }
    }

    @Override
    public boolean set_air_condition_OFF() {
        if (Set_Air_Condition_ON == true) {
            System.out.println("on");
            return true;


        } else {
            System.out.println("off");
            return false;

        }
    }
}
