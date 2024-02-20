package tamrin_1;

public abstract class shape
{
    private String color;
    private boolean filled;

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public shape()
    {
        color="wait";
        filled=true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double get_area ();

    public abstract double get_perimeter();

    public abstract String to_String();

}
