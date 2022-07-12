package on_tap_huongdoituong.quanly_nghiduong_furama.models.facility;

public class Room extends Facility {
    private String freeOfCharge;

    public Room() {
    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeOfCharge) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeOfCharge = freeOfCharge;
    }

    public String getFreeOfCharge() {
        return freeOfCharge;
    }

    public void setFreeOfCharge(String freeOfCharge) {
        this.freeOfCharge = freeOfCharge;
    }

    @Override
    public String toString() {
        return " Room: " +
                super.toString() +
                ", Free Of Charge (FOC): " + freeOfCharge;
    }

    @Override
    public String writeToFile(){
        return super.writeToFile() + "," +
                freeOfCharge;
    }
}
