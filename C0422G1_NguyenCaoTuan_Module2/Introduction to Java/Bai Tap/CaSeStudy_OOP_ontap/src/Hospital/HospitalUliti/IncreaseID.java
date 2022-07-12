package Hospital.HospitalUliti;

import Hospital.HospitalModel.People.FileHospital;
import Mobile.Model.Mobile.Mobile;
import Mobile.Uliti.ReadAndWrite;

import java.util.List;

public class IncreaseID {
    private static final String CSV_PATH_FILE = "bai_tap/src/Hospital/HospitalDaTa/FileHospital.csv";
    public static int increaseID() {
        List<FileHospital> list = ReadAndWriteFileHospital.readFileList(CSV_PATH_FILE);
        int id;
        if (list.isEmpty()) id = 1;
        else {
            boolean flag;
            do {
                flag = false;
                id = Integer.parseInt(list.get(list.size() - 1).getId()) + 1;
                for (FileHospital c : list) {
                    if (Integer.parseInt(c.getId()) == id) {
                        id++;
                        flag = true;
                    }
                }
            } while (flag);
        }
        return id;
    }
}
