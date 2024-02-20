package tamrin_2;

public class petroleumPrice
{
    private int gasolinePrice;
    private int dieselPrice;

    public petroleumPrice(int gasolinePrice, int dieselPrice) {
        this.gasolinePrice = gasolinePrice;
        this.dieselPrice = dieselPrice;
    }

    public petroleumPrice() {
    }

    public int getGasolinePrice() {
        return gasolinePrice;
    }

    public int getDieselPrice() {
        return dieselPrice;
    }
}
