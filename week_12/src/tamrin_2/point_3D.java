package tamrin_2;

public class point_3D extends point_2D {
    private float z = 0.0f;

    public point_3D() {
    }

    public point_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void set_x_y_z(float x, float y ,float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] get_x_y_z() {
        float[] get_xy = {getX(), getY() , getZ()};
        return get_xy;

    }

    @Override
    public String toString() {
        return "point_3D{"+super.toString() +
                "z=" + z +
                '}';
    }
}