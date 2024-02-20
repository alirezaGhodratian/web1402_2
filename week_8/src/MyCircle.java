public class MyCircle
{
    //tamrin4
    private MyPoint center =new MyPoint(0,0);
    private int radius=1;

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x , int y, int radius) {
        center = new MyPoint(x ,y);
        this.radius = radius;
    }

    public MyCircle() {
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int GetCenter_x ()
    {
        return this.center.getX();
    }

    public int GetCenter_y ()
    {
        return this.center.getY();
    }

    public void SetCenter_x (int x)
    {

        this.center.setX(x);
    }

    public void SetCenter_y (int y)
    {

        this.center.setY(y);
    }

    public int [] GetCenter_xy ()
    {
        return this.center.get_xy();
    }

    public void SetCenter_xy (int x ,int y)
    {
        this.center.set_xy(x,y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }

    public double GetArea ()
    {
        return radius*radius*Math.PI;
    }

    public double GetCircumference ()
    {
        return (radius*2)*Math.PI;
    }

    public double distance(MyCircle another )
    {
        return center.distance(another.GetCenter_x() ,another.GetCenter_y());
    }


}
