package Mobile.Model.Mobile;

public abstract class Mobile {
    private String id;
    private String name;
    private String cost;
    private int quantity;
    private String brand;

    public Mobile() {
    }

    public Mobile(String id, String name, String cost, int quantity, String brand) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toGetData(){
        return getId()+","+getName()+","+getCost()+","+getQuantity()+","+getBrand();
    }

    @Override
    public String toString() {
        return  "ID: '" + id + '\'' +
                ", Tên: '" + name + '\'' +
                ", Giá: '" + cost + '\'' +
                ", Số lượng: '" + quantity +
                ", Hãng: '" + brand + '\'';
    }

}
