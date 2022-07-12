package Mobile.Uliti;

import Mobile.Model.Mobile.AuthenticPhone;
import Mobile.Model.Mobile.HandCarriedPhone;
import Mobile.Model.Mobile.Mobile;

import java.util.List;

public class IncreaseID {
    private static final String CSV_PATH_FILE = "bai_tap/src/Mobile/Data/MobileCSV.csv";
    public static int increaseID() {
        List<Mobile> list = ReadAndWrite.readFileList(CSV_PATH_FILE);
        int id;
        if (list.isEmpty()) id = 1;
        else {
            boolean flag;
            do {
                flag = false;
                id = Integer.parseInt(list.get(list.size() - 1).getId()) + 1;
                for (Mobile c : list) {
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
