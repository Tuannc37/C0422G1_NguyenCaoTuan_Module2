package ss6_ke_thua.bai_tap.point_moveable_point;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
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

    public void setXY(float x1, float y1) {
        this.x = x1;
        this.y = y1;
    }

    public float[] getXY() {
        float[] a = {getX(), getY()};
        return a;
    }

    @Override
    public String toString() {
        return "(" + getX() + " , " + getY() + ")";
    }

}