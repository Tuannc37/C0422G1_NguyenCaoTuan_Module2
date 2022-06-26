package ss14_xulyngoaile_deubug.bai_tap;

public class Angle {
    private float a;
    private float b;
    private float c;

    public Angle() {
    }
    public Angle(float a, float b, float c) throws IllegalTriangleException{
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Nhập sai.Cạnh bạn nhập là số âm");
        } else if ((a + b <= c) || (a + c <= b) || (c + b <= a)) {
            throw new IllegalTriangleException("Ba cạnh bạn nhập không phải là ba cạnh của một tam giác");
        } else {
            System.out.println("Bạn nhập đúng");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
