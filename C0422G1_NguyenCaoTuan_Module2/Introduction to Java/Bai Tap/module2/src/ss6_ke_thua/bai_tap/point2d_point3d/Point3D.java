package ss6_ke_thua.bai_tap.point2d_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(int i, int i1) {
        super();
        this.z = 0;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        setZ(z);
    }
    public float[] getXYZ(){
        float[] a ={getX(),getY(),getZ()};
        return a;
    }

    @Override
    public String toString() {
        return "\nx = " + super.getX() + "\ny = " + super.getY() + "\nz = " + getZ() + "\nTọa độ B(" + super.getX() + " , " + super.getY() + " , " + getZ() + ")";
    }
}
