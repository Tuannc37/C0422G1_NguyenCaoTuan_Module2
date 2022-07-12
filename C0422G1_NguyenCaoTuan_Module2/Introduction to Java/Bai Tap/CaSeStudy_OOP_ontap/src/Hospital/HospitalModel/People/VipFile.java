package Hospital.HospitalModel.People;

public class VipFile extends FileHospital {
    private String type;
    private String duration;

    public VipFile() {
    }

    public VipFile(String type, String duration) {
        this.type = type;
        this.duration = duration;
    }

    public VipFile(String id, String codeFile, String name, String dayIn, String dayOut, String reason, String type, String duration) {
        super(id, codeFile, name, dayIn, dayOut, reason);
        this.type = type;
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String getData() {
        return super.getData()+","+getType()+","+getDuration();
    }
}
