import java.awt.*;

public class circle
{
    int shoa ;

    COLOR color ;
    String col;

    public circle()
    {
        this.shoa = 1;
        this.col ="white";
        this.color =COLOR.valueOf(col);
    }

    public circle(int shoa)
    {
        this.shoa = shoa;
    }

    public circle(int shoa, String col)
    {
        this.shoa = shoa;
        this.col = col;
        this.color =COLOR.valueOf(col);
    }

    public int getShoa()
    {
        return shoa;
    }

    public void setShoa(int shoa)
    {
        this.shoa = shoa;
    }

    public String getCol()
    {
        return col;
    }

    public void setCol(String col)
    {
        this.col = col;

        color =COLOR.valueOf(col);
    }

    public double area ()
    {
        return (shoa *shoa )* Math.PI;
    }
    public double perimeter ()
    {
        return (shoa *2)* Math.PI;
    }

    @Override
    public String toString()
    {
        return "circle{" +
                "radius=" + shoa +
                ", color=" + color +
                " area= "+ area() +
                "perimeter= " + perimeter()+
                '}';
    }

}






