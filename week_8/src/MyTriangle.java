public class MyTriangle
{
    //tamrin5
    private MyPoint v1=new MyPoint();
    private MyPoint v2=new MyPoint();
    private MyPoint v3=new MyPoint();

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1 ,int y1,int x2 ,int y2,int x3,int y3) {
        this.v1.set_xy(x1,y1);
        this.v2.set_xy(x2,y2);
        this.v3.set_xy(x3,y3);

    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                '}';
    }

    public double GetPerimeter()
    {
        return (v1.distance(v2))+(v2.distance(v3))+(v3.distance(v1));

    }

    public String getTvbe ()
    {
        if ((v1.distance(v2))==(v2.distance(v3)) && (v2.distance(v3))==(v3.distance(v1)))
            return "equilateral";
        else if((v1.distance(v2))==(v2.distance(v3)) || (v2.distance(v3))==(v3.distance(v1)) || (v3.distance(v1))==(v1.distance(v2)))
            return "isosceles";
        else
            return "scalene";
    }






}
