package ss5_huongdoituong.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.print("Diện tích hình tròn là : " + circle.getArea());
        System.out.print("\nChu vi hình tròn là : " + circle.getPerimeter());
    }
}
