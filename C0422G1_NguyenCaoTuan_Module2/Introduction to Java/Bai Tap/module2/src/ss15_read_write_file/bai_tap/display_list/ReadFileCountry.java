package ss15_read_write_file.bai_tap.display_list;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCountry {
    public static List<Country> readNationFile(){
        List<Country> countryList = new ArrayList<>();
        File file = new File("src/ss15_read_write_file/bai_tap/display_list/csv.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        String[] arr = null;
        try {
            fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Country nation = new Country(Integer.parseInt(arr[0]),arr[1],arr[2]);
                countryList.add(nation);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
        return countryList;
    }
}
