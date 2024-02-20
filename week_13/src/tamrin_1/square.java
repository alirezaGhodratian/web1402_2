package tamrin_1;

public class square extends rectangle
{

    public square() {
    }

    public square(double side) {
        super(side, side);
    }

    public square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double get_side()
    {
        return getLength();
    }
    public void set_side(double side)
    {
        setLength(side);
        setWidth(side);

    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String to_String() {
        return "{ side = "+get_side()+" , color = "+super.getColor()+" , filled = "+isFilled()+" }";
    }
}
