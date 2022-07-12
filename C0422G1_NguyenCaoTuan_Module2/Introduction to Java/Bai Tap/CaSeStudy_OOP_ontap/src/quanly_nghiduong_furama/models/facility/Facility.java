package on_tap_huongdoituong.quanly_nghiduong_furama.models.facility;

public abstract class Facility {
    private String idFacility;
    private String nameService;
    private double areaUse;
    int rentalPrice;
    int rentalPeopleMax;
    String styleRental;

    public Facility() {
    }

    public Facility(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalPrice = rentalPrice;
        this.rentalPeopleMax = rentalPeopleMax;
        this.styleRental = styleRental;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentalPeopleMax() {
        return rentalPeopleMax;
    }

    public void setRentalPeopleMax(int rentalPeopleMax) {
        this.rentalPeopleMax = rentalPeopleMax;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return "Id Facility: " + idFacility +
                ", Name Service:" + nameService +
                ", Area Use: " + areaUse +
                ", Rental Price: " + rentalPrice +
                ", Rental People Max: " + rentalPeopleMax +
                ", StyleRental: " + styleRental ;
    }

    public String writeToFile(){
        return idFacility + "," +
                nameService + "," +
                areaUse + "," +
                rentalPrice + "," +
                rentalPeopleMax + "," +
                styleRental;
    }
}
