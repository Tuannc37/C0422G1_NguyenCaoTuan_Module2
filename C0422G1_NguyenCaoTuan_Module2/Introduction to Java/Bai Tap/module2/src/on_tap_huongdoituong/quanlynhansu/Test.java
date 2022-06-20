package on_tap_huongdoituong.quanlynhansu;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Tuan","Nam","Nghe An","Giam doc",1000000);
        employee1.input();
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
