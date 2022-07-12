package on_tap_huongdoituong.quanly_nghiduong_furama.util;


import on_tap_huongdoituong.quanly_nghiduong_furama.models.Booking;
import on_tap_huongdoituong.quanly_nghiduong_furama.models.facility.Facility;
import on_tap_huongdoituong.quanly_nghiduong_furama.models.facility.House;
import on_tap_huongdoituong.quanly_nghiduong_furama.models.facility.Room;
import on_tap_huongdoituong.quanly_nghiduong_furama.models.facility.Villa;

import java.io.*;
import java.util.*;

public class ReadAndWriteFurama {
    public static final String FACILITY_LIST = "src\\data\\facility.csv";
    public static final String VILLA_LIST = "src\\data\\villa.csv";
    public static final String HOUSE_LIST = "src\\data\\house.csv";
    public static final String ROOM_LIST = "src\\data\\room.csv";
    public static final String BOOKING_LIST = "src\\data\\booking.csv";


    public static void writeList(String path, String line) throws IOException {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeList(String path, List<String> list){
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> readList(String path)  {
        List<String[]> myList = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                myList.add(arrStr);
            }
            return myList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }

    public static void writeFacility(Map<Facility, Integer> facilityIntegerMap , String path){
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for(Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()){
                line = map.getKey().writeToFile() + "," + map.getValue();
                if (checkToWrite(path, line)){
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> readFacilityCsv() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FACILITY_LIST));
            String line = "";
            String[] arr;
            Villa villa;
            House house;
            Room room;
            while ((line = br.readLine()) != null) {
                arr = line.split(",");
                if (arr[0].contains("SVVL")){
                    villa = new Villa(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6],
                            Double.parseDouble(arr[7]),
                            Integer.parseInt(arr[8]));
                    facilityIntegerMap.put(villa,Integer.parseInt(arr[9]));
                } else if (arr[0].contains("SVHO")) {
                    house = new House(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6],
                            Integer.parseInt(arr[7]));
                    facilityIntegerMap.put(house,Integer.parseInt(arr[8]));
                }else if (arr[0].contains("SVRO")){
                    room = new Room(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6]);
                    facilityIntegerMap.put(room,Integer.parseInt(arr[7]));
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return facilityIntegerMap;
    }

    public static void writeBookingFile(Set<Booking> bookingFile , String path){
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            BufferedWriter bufferedReader = new BufferedWriter(fileWriter);
            for (Booking booking : bookingFile) {
                bufferedReader.write(booking.writeToFile());
                bufferedReader.newLine();
            }
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean checkToWrite(String path, String line){
        boolean check = false;
        if (path.equals(VILLA_LIST) && line.contains("SVVL") ||
            path.equals(HOUSE_LIST) && line.contains("SVHO") ||
            path.equals(ROOM_LIST) && line.contains("SVRO") ||
            path.equals(FACILITY_LIST)){
            check = true;
        }
        return check;
    }

    public static void writeBooking(TreeSet<Booking> bookTreeSet, String path){
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Booking booking : bookTreeSet) {
                line = booking.writeToFile();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static TreeSet<Booking> readBooking(){
        TreeSet<Booking> bookingSet = new TreeSet<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(BOOKING_LIST));
            String line = "";
            String[] arr;
            Booking booking;
            while ((line = bufferedReader.readLine()) != null){
                arr = line.split(",");
                booking = new Booking(Integer.parseInt(arr[0]),arr[1], arr[2], arr[3], arr[4]);
                bookingSet.add(booking);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return bookingSet;
    }
}
