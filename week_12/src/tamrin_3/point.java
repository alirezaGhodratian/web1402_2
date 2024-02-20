package tamrin_3;

public class point
{
    private float x = 0.0f;
    private float y =0.0f;

    public point() {
    }

    public point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void set_x_y (float x , float y)
    {
        setX(x);
        setY(y);
    }
    public float[] get_x_y()
    {
        float[]get_xy = {getX() , getY()};
        return get_xy;

    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



}
