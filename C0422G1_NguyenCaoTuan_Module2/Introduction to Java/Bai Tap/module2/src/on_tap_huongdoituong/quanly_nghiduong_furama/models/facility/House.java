package models.facility;

public class House extends Facility {
    private String standardHouse;
    private int floor;

    public House() {
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHouse, int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House " + super.toString() +
                ", Standard House: " + standardHouse +
                ", Floor: " + floor;
    }

    @Override
    public String writeToFile(){
        return super.writeToFile() + "," +
                standardHouse + "," +
                floor;
    }
}
