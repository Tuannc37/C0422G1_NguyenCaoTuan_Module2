package models.person;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String gender;
    private int idCard;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id,
                  String name,
                  String dateOfBirth,
                  String address,
                  String gender,
                  int idCard,
                  int phoneNumber,
                  String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Date Of Birth: " + dateOfBirth +
                ", Address: " + address +
                ", Gender: " + gender +
                ", IdCard: " + idCard +
                ", Phone Number: " + phoneNumber +
                ", Email: " + email;
    }
}
