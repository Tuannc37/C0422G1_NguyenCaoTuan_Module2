package ss17_string_regex.thuc_hanh.validate_account;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String regex) {
        return regex.matches(ACCOUNT_REGEX);
    }
}
