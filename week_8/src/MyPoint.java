public class MyPoint
{
    //tamrin3
    private int x= 0;
    private int y= 0;


    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

    public int[] get_xy ()
     {
         int[] x_y ={this.x ,this.y};
         return x_y;
     }

     public void set_xy (int x , int y)
    {
        this.x = x;
        this.y= y;

    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance (int x ,int y)
    {
        double dis= Math.pow((this.x - x) , 2)+Math.pow((this.y - y) , 2);

        return Math.sqrt(dis);

    }

    public double distance (MyPoint another)
    {
        double dis= Math.pow((this.x - another.x) , 2)+Math.pow((this.y - another.y) , 2);

        return Math.sqrt(dis);

    }

    public double distance ()
    {
        double dis= Math.pow((this.x - 0) , 2)+Math.pow((this.y - 0) , 2);

        return Math.sqrt(dis);

    }



}

