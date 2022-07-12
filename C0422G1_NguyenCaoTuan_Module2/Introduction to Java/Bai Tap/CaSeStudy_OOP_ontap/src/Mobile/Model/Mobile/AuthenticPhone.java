package Mobile.Model.Mobile;

public class AuthenticPhone extends Mobile {
    private String insuranceTime;
    private String insuranceArea;

    public AuthenticPhone() {
    }

    public AuthenticPhone(String insuranceTime, String insuranceArea) {
        this.insuranceTime = insuranceTime;
        this.insuranceArea = insuranceArea;
    }

    public AuthenticPhone(String id, String name, String cost, int quantity, String brand, String insuranceTime, String insuranceArea) {
        super(id, name, cost, quantity, brand);
        this.insuranceTime = insuranceTime;
        this.insuranceArea = insuranceArea;
    }


    public String getInsuranceTime() {
        return insuranceTime;
    }

    public void setInsuranceTime(String insuranceTime) {
        this.insuranceTime = insuranceTime;
    }

    public String getInsuranceArea() {
        return insuranceArea;
    }

    public void setInsuranceArea(String insuranceArea) {
        this.insuranceArea = insuranceArea;
    }

    @Override
    public String toGetData() {
        return super.toGetData()+","+getInsuranceTime()+","+getInsuranceArea();
    }

    @Override
    public String toString() {
        return "Điện thoại chính hãng: " +  super.toString()+ '\'' +
                "Thời gian bảo hành: '" + insuranceTime + '\'' +
                ", Khu vực bảo hành: '" + insuranceArea + '\'' ;
    }
}
