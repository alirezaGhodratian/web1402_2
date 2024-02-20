package tamrin_4;

public class circle extends shape
{
    private double radius = 1.0;

    public circle() {
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double get_Area ()
    {
        return Math.pow(radius,2)*Math.PI;
    }
    public double get_perimeter()
    {
        return (radius*2)*Math.PI;
    }

    @Override
    public String toString() {
        return "circle{"+ super.to_String() +
                "radius=" + radius +
                '}';
    }
}
