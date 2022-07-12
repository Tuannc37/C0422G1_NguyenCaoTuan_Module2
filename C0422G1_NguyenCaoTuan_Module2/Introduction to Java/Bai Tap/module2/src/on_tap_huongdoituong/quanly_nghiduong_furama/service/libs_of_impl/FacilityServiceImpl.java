package services.libs_of_impl;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.libs_of_interface.FacilityService;
import utils.ReadAndWrite;
import utils.regex.RegexFacility;

import java.util.*;

public class FacilityServiceImpl extends ServiceAbstract implements FacilityService {

    public static final String FACILITY_LIST = "src\\data\\facility.csv";
    public static final String VILLA_LIST = "src\\data\\villa.csv";
    public static final String HOUSE_LIST = "src\\data\\house.csv";
    public static final String ROOM_LIST = "src\\data\\room.csv";
    public static Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityCsv();
    public static List<Villa> villaList = getVillaList();
    public static List<House> houseList = getHouseList();
    public static List<Room> roomList = getRoomList();
    public static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        boolean check = true;
        while (check) {
            System.out.println("1.Display Facility");
            System.out.println("2.Display Villa");
            System.out.println("3.Display House");
            System.out.println("4.Display Room");
            System.out.println("0.Return main menu");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        try {
                            if (facilityIntegerMap.size() == 0) {
                                throw new NullPointerException();
                            } else {
                                for (Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()) {
                                    System.out.println("Service Name = " + map.getKey() + " , Hire Numbers = " + map.getValue());
                                }
                            }
                        } catch (NullPointerException e) {
                            System.err.println("Please add new Facility");
                        }
                        break;
                    }
                    case 2: {
                        displayVillaList();
                        break;
                    }
                    case 3: {
                        displayHouseList();
                        break;
                    }
                    case 4: {
                        displayRoomList();
                        break;
                    }
                    case 0:{
                        check = false;
                        break;
                    }
                    default:{
                        System.out.println("Retry");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }
        }
    }

    @Override
    public void displayMaintain() {

    }

    public void addFacilityMaintain() {

    }

    @Override
    public void addNewVilla() throws Exception {
        String id = RegexFacility.inputIdVilla();
        String name = RegexFacility.inputNameFacility();
        double areaUse = Double.parseDouble(RegexFacility.inputArea());
        int price = RegexFacility.inputPrice();
        int maxPeople = Integer.parseInt(RegexFacility.inputAmount());
        String style = RegexFacility.inputStyle();
        String standard = RegexFacility.inputStandard();
        double areaPool = Double.parseDouble(RegexFacility.inputAreaOfPool());
        int floor = Integer.parseInt(RegexFacility.inputFloor());

        Villa villa = new Villa(id, name, areaUse, price, maxPeople, style, standard, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        String line = id + "," +
                name + "," +
                areaUse + "," +
                price + "," +
                maxPeople + "," +
                style + "," +
                standard + "," +
                areaPool + "," +
                floor;
        ReadAndWrite.writeList(VILLA_LIST, line);
        ReadAndWrite.writeFacility(facilityIntegerMap,FACILITY_LIST);
        System.out.println("Thêm mới thành công");
    }

    public static List<Villa> getVillaList() {
        List<Villa> listFileVilla = new ArrayList<>();
        List<String[]> listStr = ReadAndWrite.readList(VILLA_LIST);
        Villa villa;
        for (String[] element : listStr) {
            villa = new Villa(element[0],
                    element[1],
                    Double.parseDouble(element[2]),
                    Integer.parseInt(element[3]),
                    Integer.parseInt(element[4]),
                    element[5],
                    element[6],
                    Double.parseDouble(element[7]),
                    Integer.parseInt(element[8]));
            listFileVilla.add(villa);
        }
        return listFileVilla;
    }

    public void displayVillaList() {
        villaList = getVillaList();
        for (Villa villa : villaList) {
            System.out.println(villa.toString());
        }
    }

    @Override
    public void addNewHouse() throws Exception {
        String id = RegexFacility.inputIdHouse();
        String name = RegexFacility.inputNameFacility();
        double areaUse = Double.parseDouble(RegexFacility.inputArea());
        int price = RegexFacility.inputPrice();
        int maxPeople = Integer.parseInt(RegexFacility.inputAmount());
        String style = RegexFacility.inputStyle();
        String standard = RegexFacility.inputStandard();
        int floor = Integer.parseInt(RegexFacility.inputFloor());

        House house = new House(id, name, areaUse, price, maxPeople, style, standard, floor);
        facilityIntegerMap.put(house, 0);
        String line = id + "," +
                name + "," +
                areaUse + "," +
                price + "," +
                maxPeople + "," +
                style + "," +
                standard + "," +
                floor;
        ReadAndWrite.writeList(HOUSE_LIST, line);
        ReadAndWrite.writeFacility(facilityIntegerMap,FACILITY_LIST);
        System.out.println("Thêm mới thành công");
    }

    public static List<House> getHouseList() {
        List<House> listFileHouse = new ArrayList<>();
        List<String[]> listStr = ReadAndWrite.readList(HOUSE_LIST);
        House house;
        for (String[] element : listStr) {
            house = new House(element[0],
                    element[1],
                    Double.parseDouble(element[2]),
                    Integer.parseInt(element[3]),
                    Integer.parseInt(element[4]),
                    element[5],
                    element[6],
                    Integer.parseInt(element[7]));
            listFileHouse.add(house);
        }
        return listFileHouse;
    }

    public void displayHouseList() {
        houseList = getHouseList();
        for (House house : houseList) {
            System.out.println(house.toString());
        }
    }

    @Override
    public void addNewRoom() throws Exception {
        String id = RegexFacility.inputIdRoom();
        String name = RegexFacility.inputNameFacility();
        double areaUse = Double.parseDouble(RegexFacility.inputArea());
        int price = RegexFacility.inputPrice();
        int maxPeople = Integer.parseInt(RegexFacility.inputAmount());
        String style = RegexFacility.inputStyle();
        String freeOfCharge = RegexFacility.inputFOC();

        Room room = new Room(id, name, areaUse, price, maxPeople, style, freeOfCharge);
        facilityIntegerMap.put(room, 0);
        String line = id + "," +
                name + "," +
                areaUse + "," +
                price + "," +
                maxPeople + "," +
                style + "," +
                freeOfCharge;
        ReadAndWrite.writeList(ROOM_LIST, line);
        ReadAndWrite.writeFacility(facilityIntegerMap,FACILITY_LIST);
        System.out.println("Thêm mới thành công");
    }

    public static List<Room> getRoomList() {
        List<Room> listFileRoom = new ArrayList<>();
        List<String[]> listStr = ReadAndWrite.readList(ROOM_LIST);
        Room room;
        for (String[] element : listStr) {
            room = new Room(element[0],
                    element[1],
                    Double.parseDouble(element[2]),
                    Integer.parseInt(element[3]),
                    Integer.parseInt(element[4]),
                    element[5],
                    element[6]);
            listFileRoom.add(room);
        }
        return listFileRoom;
    }

    public void displayRoomList() {
        roomList = getRoomList();
        for (Room room : roomList) {
            System.out.println(room.toString());
        }
    }
}
