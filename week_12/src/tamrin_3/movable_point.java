package tamrin_3;

import java.util.Scanner;

public class movable_point extends point
{
    private float speed_x=0.0f;
    private float speed_y=0.0f;

    public movable_point(float speed_x, float speed_y) {
        this.speed_x = speed_x;
        this.speed_y = speed_y;
    }

    public movable_point(float x, float y, float speed_x, float speed_y) {
        super(x, y);
        this.speed_x = speed_x;
        this.speed_y = speed_y;
    }

    public movable_point() {
    }

    public float getSpeed_x() {
        return speed_x;
    }

    public void setSpeed_x(float speed_x) {
        this.speed_x = speed_x;
    }

    public float getSpeed_y() {
        return speed_y;
    }

    public void setSpeed_y(float speed_y) {
        this.speed_y = speed_y;
    }

    public void set_speed( float speed_x, float speed_y )
    {
        setSpeed_x  (speed_x);
       setSpeed_y  (speed_y);

    }

    public float[] get_speed()
    {
        float[]speed ={ getSpeed_x() ,getSpeed_y() };
        return speed;
    }

    @Override
    public String toString() {
        return "{ "+super.toString()+" , speed = ("+speed_x+" ,"+speed_y+") }";
    }

    public movable_point move ()
    {
        Scanner scanner = new Scanner(System.in);
        movable_point a =new movable_point();
        System.out.println("add your x and y");
        a.set_x_y(Float.valueOf(scanner.nextLine()) , Float.valueOf(scanner.nextLine()));
        System.out.println("add your x speed and y speed");
        a.set_speed(Float.valueOf(scanner.nextLine()) ,Float.valueOf(scanner.nextLine()));

         a.setX(a.getX()+a.getSpeed_x());
         a.setY(a.getY()+a.getSpeed_y());


         return a;
    }

}
