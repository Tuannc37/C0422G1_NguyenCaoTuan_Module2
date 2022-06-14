package ss6_ke_thua.bai_tap.point_moveable_point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2,3);

        System.out.print("Point : " + point1.toString());

        point1.setX(4);
        point1.setY(5);
        System.out.print("\nPoint : " + point1.toString());

        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);

        System.out.print("\nMoveablePoint : " + moveablePoint.toString());

        moveablePoint.setSpeed(10,10);
        System.out.print("\nMoveablePoint : " + moveablePoint.toString());

        System.out.print("\nMove : " + moveablePoint.move());

    }
}
