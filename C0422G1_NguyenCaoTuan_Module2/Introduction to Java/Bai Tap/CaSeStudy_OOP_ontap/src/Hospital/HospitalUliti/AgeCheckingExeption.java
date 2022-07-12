package Hospital.HospitalUliti;

public class AgeCheckingExeption extends Exception{
    public AgeCheckingExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào tuổi: " + super.getMessage();
    }
}
