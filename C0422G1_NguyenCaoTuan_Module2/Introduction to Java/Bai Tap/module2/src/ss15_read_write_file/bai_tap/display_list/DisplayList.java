package ss15_read_write_file.bai_tap.display_list;

import java.util.ArrayList;
import java.util.List;

public class DisplayList {
    public static void main(String[] args) {
        display();
    }

    public static void display(){
        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < ReadFileCountry.readNationFile().size(); i++) {
            System.out.println(ReadFileCountry.readNationFile().get(i).toString());
        }
    }
}
