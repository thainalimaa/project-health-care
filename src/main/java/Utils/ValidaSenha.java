package Utils;

import java.util.regex.Pattern;

/**
 *
 * @author Gusta
 */

public class ValidaSenha {
        
    private static final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
    
    public static Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    
}
