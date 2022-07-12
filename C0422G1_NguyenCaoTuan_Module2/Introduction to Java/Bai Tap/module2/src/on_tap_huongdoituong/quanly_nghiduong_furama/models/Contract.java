package models;

public class Contract {
    private String idContract;
    private int idBooking;
    private String prePayment;
    private String expense;
    private int idCustomer;

    public Contract() {
    }

    public Contract(String idContract, int booking, String prePayment, String expense, int customer) {
        this.idContract = idContract;
        this.idBooking = booking;
        this.prePayment = prePayment;
        this.expense = expense;
        this.idCustomer = customer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(String prePayment) {
        this.prePayment = prePayment;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", booking=" + idBooking +
                ", prePayment='" + prePayment + '\'' +
                ", Expense='" + expense + '\'' +
                ", customer=" + idCustomer +
                '}';
    }

    public String writeToFile(){
        return idContract + "," +
                idBooking + "," +
                prePayment + "," +
                expense + "," +
                idCustomer;
    }
}
