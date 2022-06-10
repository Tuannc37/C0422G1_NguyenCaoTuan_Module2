package ss4_laptrinhhuongdoituong.bai_tap.quadraticequation;

public class QuadraticEquation {
    private double a,b,c;
    public  QuadraticEquation(){

    }
    public  QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.a;
    }
    public double getC(){
        return this.a;
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.pow(getDiscriminant(), 0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.pow(getDiscriminant(), 0.5))/(2*a);
    }

}
