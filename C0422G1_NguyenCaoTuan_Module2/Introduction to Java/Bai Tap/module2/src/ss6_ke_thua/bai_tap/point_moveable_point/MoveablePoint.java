package ss6_ke_thua.bai_tap.point_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed1,float ySpeed1){
        this.xSpeed = xSpeed1;
        this.ySpeed = ySpeed1;
    }
    public float[] getSpeed(){
        float[] a = {getxSpeed(), getySpeed()};
        return a;
    }

    @Override
    public String toString() {
        return  super.toString() + " , speed = (" + xSpeed + " , " + ySpeed + ")";
    }

    public MoveablePoint move(){
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }
}
