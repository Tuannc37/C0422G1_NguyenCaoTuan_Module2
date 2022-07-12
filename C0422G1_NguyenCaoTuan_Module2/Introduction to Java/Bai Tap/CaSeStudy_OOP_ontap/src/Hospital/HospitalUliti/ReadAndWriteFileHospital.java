package Hospital.HospitalUliti;

import Hospital.HospitalModel.People.FileHospital;
import Hospital.HospitalModel.People.NomarlFile;
import Hospital.HospitalModel.People.VipFile;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ReadAndWriteFileHospital {

    public static <E> void writeList(List<E> eList, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : eList) {
                if (e instanceof VipFile) {
                    bufferedWriter.write(((VipFile) e).getData());
                    bufferedWriter.newLine();
                }
                if (e instanceof NomarlFile) {
                    bufferedWriter.write(((NomarlFile) e).getData());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<FileHospital> readFileList(String pathFile) {
        List<FileHospital> list = new LinkedList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        String[] array = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) continue;
                array = line.split(",");
                if (array.length == 8) {
                    list.add(new VipFile((array[0]), array[1], array[2], (array[3]),
                           (array[4]), array[5], (array[6]),
                            array[7]));
                }
                if (array.length == 7) {
                    list.add(new NomarlFile((array[0]), array[1], array[2], (array[3]),
                            (array[4]), array[5], (array[6])));
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}

