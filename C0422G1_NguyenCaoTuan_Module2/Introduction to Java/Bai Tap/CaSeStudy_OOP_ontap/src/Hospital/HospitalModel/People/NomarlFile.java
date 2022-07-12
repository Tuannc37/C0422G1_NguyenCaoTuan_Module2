package Hospital.HospitalModel.People;

import java.time.LocalDate;

public class NomarlFile extends FileHospital {
    private String cost;

    public NomarlFile() {
    }

    public NomarlFile(String cost) {
        this.cost = cost;
    }

    public NomarlFile(String id, String codeFile, String name, String dayIn, String dayOut, String reason, String cost) {
        super(id, codeFile, name, dayIn, dayOut, reason);
        this.cost = cost;
    }


    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String getData() {
        return super.getData()+","+cost;
    }

    @Override
    public String toString() {
        return "NomarlFile: " + super.toString() +
                ", cost='" + cost + '\'';
    }
}
