package tamrin_2;

public class truck extends vehicle
{
    private int numberOfSeats;
    private boolean Set_Air_Condition_ON;
    private double power;

    public truck(int gasolinePrice, int dieselPrice, String modelName, String company, String owner, String engineType, double tankSize, double fuelConsumption, int numberOfSeats, boolean set_Cir_Condition_ON, double power) {
        super(gasolinePrice, dieselPrice, modelName, company, owner, engineType, tankSize, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
        Set_Air_Condition_ON = set_Cir_Condition_ON;
        this.power = power;
    }

    public truck(int gasolinePrice, int dieselPrice, int numberOfSeats, boolean set_Cir_Condition_ON, double power) {
        super(gasolinePrice, dieselPrice);
        this.numberOfSeats = numberOfSeats;
        Set_Air_Condition_ON = set_Cir_Condition_ON;
        this.power = power;
    }

    public truck(int numberOfSeats, boolean set_Cir_Condition_ON, double power) {
        this.numberOfSeats = numberOfSeats;
        Set_Air_Condition_ON = set_Cir_Condition_ON;
        this.power = power;
    }

    public truck() {
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

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "truck{" +super.toString() +
                "numberOfSeats=" + numberOfSeats +
                ", Set_Cir_Condition_ON=" + Set_Air_Condition_ON +
                ", power=" + power +
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
