package ss15_read_write_file.bai_tap.display_list;

public class DisplayList {
    public static void main(String[] args) {
        display();
    }

    public static void display(){
        for (int i = 0; i < ReadFileCountry.readCountryFile().size(); i++) {
            System.out.println(ReadFileCountry.readCountryFile().get(i).toString());
        }
    }
}
