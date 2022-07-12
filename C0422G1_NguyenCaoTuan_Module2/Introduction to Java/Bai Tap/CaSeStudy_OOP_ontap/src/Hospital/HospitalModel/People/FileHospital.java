package Hospital.HospitalModel.People;

public abstract class FileHospital {
    private String id;
    private String codeFile;
    private String name;
    private String dayIn;
    private String dayOut;
    private String reason;

    public FileHospital() {
    }

    public FileHospital(String id, String codeFile, String name, String dayIn, String dayOut, String reason) {
        this.id = id;
        this.codeFile = codeFile;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.reason = reason;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeFile() {
        return codeFile;
    }

    public void setCodeFile(String codeFile) {
        this.codeFile = codeFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getData(){
        return getId()+","+getCodeFile()+","+getName()+","+getDayIn()+","+getDayOut()+","+getReason();
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", codeFile='" + codeFile + '\'' +
                ", name='" + name + '\'' +
                ", dayIn=" + dayIn +
                ", dayOut=" + dayOut +
                ", reason='" + reason + '\'';
    }
}
