package on_tap_huongdoituong.baitap_mvc.model;

public class Product {
    private int Id;
    private String Name;
    private int Cost;

    public Product(String id, String name, String manufacturer, float price) {
    }

    public Product(int id, String name, int cost) {
        Id = id;
        Name = name;
        Cost = cost;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Sản Phẩm {" +
                "ID = " + Id +
                ", Tên sản phẩm = '" + Name + '\'' +
                ", Giá = " + Cost +
                '}';
    }
}
