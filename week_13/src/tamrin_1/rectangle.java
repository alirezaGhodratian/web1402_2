package tamrin_1;

public class rectangle extends shape
{
    private double width=1.0;
    private double length=1.0;

    public rectangle() {
    }

    public rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double get_area() {
        return width*length;
    }

    @Override
    public double get_perimeter() {
        return (width+length)*2;
    }

    @Override
    public String to_String() {
        return
                "tamrin_1.shape { color ="+ super.getColor() + " filled = "+ super.isFilled() +
                "tamrin_1.rectangle{"+
                "width=" + width +
                ", length=" + length +
                '}';

    }
}
