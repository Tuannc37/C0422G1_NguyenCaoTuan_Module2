package ss5_huongdoituong.bai_tap.lopchighi_trong_java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Tuan", "H2");
        student.setName("Thai");
        student.setClasses("CO2");
        System.out.print("Name : " + student.getName());
        System.out.print("\nClasses : " + student.getClasses());
    }
}
