import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassroom {
private static final String CLASS_REGEX = "[CAP]\\d{4}[GHIKLM]";

    public ValidateClassroom() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
