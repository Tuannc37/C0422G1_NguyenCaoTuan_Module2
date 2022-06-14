package ss6_ke_thua.bai_tap.point2d_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.print(point2D);

        point2D.setX(2);
        point2D.setY(3);
        System.out.print("\n" + point2D);

        Point3D point3D = new Point3D(1,2,3);
        System.out.print("\n" + point3D);

        point3D.setX(5);
        point3D.setY(6);
        point3D.setZ(10);
        System.out.print("\n" + point3D);
    }
}
