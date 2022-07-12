package Mobile.Model.Mobile;

public class HandCarriedPhone extends Mobile{
    private String country;
    private String status;

    public HandCarriedPhone() {
    }

    public HandCarriedPhone(String country, String status) {
        this.country = country;
        this.status = status;
    }

    public HandCarriedPhone(String id, String name, String cost, int quantity, String brand, String country, String status) {
        super(id, name, cost, quantity, brand);
        this.country = country;
        this.status = status;
    }

    public HandCarriedPhone(String s) {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toGetData() {
        return super.toGetData() +","+getCountry()+","+getStatus();
    }

    @Override
    public String toString() {
        return "Điện thoại xách tay: "+ super.toString()+ '\'' +
                "Quốc gia: '" + country + '\'' +
                ", Tình trạng: '" + status + '\'';
    }
}
