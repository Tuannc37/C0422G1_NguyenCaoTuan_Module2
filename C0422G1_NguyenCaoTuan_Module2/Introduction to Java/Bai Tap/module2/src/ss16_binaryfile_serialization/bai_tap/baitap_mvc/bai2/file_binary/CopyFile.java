package ss16_binaryfile_serialization.bai_tap.baitap_mvc.bai2.file_binary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {

    private static void copyFileUsingStream(File source, File target) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        File sourceFile = new File("ss16_binaryfile_serialization/bai_tap/baitap_mvc/bai2/file_binary/source _file.dat");
        File target = new File("ss16_binaryfile_serialization/bai_tap/baitap_mvc/bai2/file_binary/target _file.dat");
        copyFileUsingStream(sourceFile, target);
        System.out.println("Số byte: " + target.length());
    }
}
