package ss6_ke_thua.bai_tap.point2d_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
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

    public void setXY(float x,float y){
       setX(x) ;
       setY(y);
    }

    public float[] getXY(){
        float[] a ={getX(),getY()};
        return a;
    }

    @Override
    public String toString() {
        return "\nx = " + getX() + "\ny = " + getY() + "\nTọa độ A ("+ getX() + " , " + getY() + ")";
    }
}
