package pkg.util;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 6/24/12
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringUtil {
    static final String NEWLINE = System.getProperty("line.separator");

    private StringUtil() {}

    public static String appendNewLine(String input){
        return input + NEWLINE;
    }
}
