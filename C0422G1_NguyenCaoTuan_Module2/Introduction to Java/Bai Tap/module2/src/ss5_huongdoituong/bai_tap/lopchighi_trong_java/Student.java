package ss5_huongdoituong.bai_tap.lopchighi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {

    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
