package ss9_danhsach.bai_tap.bai1;

public class MyArrayListTest {

    public static void main(String[] args) {
        Student student1 = new Student(1,"Tuan");
        Student student2 = new Student(2,"Thin");
        Student student3 = new Student(3,"Phu");
        Student student4 = new Student(4,"Huy");
        Student student5 = new Student(5,"Bao");
        Student student6 = new Student(5,"Bao2");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
        studentMyArrayList.add(student6,2);

        System.out.println("Size : " + studentMyArrayList.size());
//        studentMyArrayList.clear();

        for(int i = 0; i < studentMyArrayList.size();i++){
            Student student = (Student)studentMyArrayList.elements[i];
            System.out.print(student.getId() + "\t");
            System.out.print(student.getName() + "\n");
        }

    }
}
