import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {

        String text = "2000, 2020, 20ab, 20755, 2011";
        Pattern pattern = Pattern.compile("20\\d{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match! " + text.substring(start, end) + "  from " + start + " to " + (end - 1));
        }
    }
}
