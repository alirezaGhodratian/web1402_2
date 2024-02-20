package tamrin_1;

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

    @Override
    public double get_area() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double get_perimeter() {
        return (radius*2)*Math.PI;
    }

    @Override
    public String to_String() {
        return "tamrin_1.shape { color ="+ super.getColor() +
                " filled = "+ super.isFilled() +
                "tamrin_1.circle{"+
                "radius=" + radius +
                '}';
    }
}
