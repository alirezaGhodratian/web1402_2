package tamrin_2;

public abstract class vehicle extends petroleumPrice
{
    private String modelName;
    private String company;
    private String owner;
    private String engineType;
    private double tankSize;
    private double fuelConsumption;

    public vehicle(int gasolinePrice, int dieselPrice, String modelName, String company, String owner, String engineType, double tankSize, double fuelConsumption) {
        super(gasolinePrice, dieselPrice);
        this.modelName = modelName;
        this.company = company;
        this.owner = owner;
        this.engineType = engineType;
        this.tankSize = tankSize;
        this.fuelConsumption = fuelConsumption;
    }

    public vehicle(int gasolinePrice, int dieselPrice) {
        super(gasolinePrice, dieselPrice);
    }

    public vehicle() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "modelName='" + modelName + '\'' +
                ", company='" + company + '\'' +
                ", owner='" + owner + '\'' +
                ", engineType='" + engineType + '\'' +
                ", tankSize=" + tankSize +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public void movable_distance()
    {


    }

    public abstract void cost_for_100_km();

    public abstract boolean set_air_condition_ON();

    public abstract boolean set_air_condition_OFF();


}
