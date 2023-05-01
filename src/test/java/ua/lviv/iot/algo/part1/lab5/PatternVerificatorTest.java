package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

class PatternVerificatorTest {
    PatternVerificator patternVerificator = new PatternVerificator();

    public String currentPassword = patternVerificator.setAllStrings("RRr444");

    @Test
    public void testRightlyWork() {
        PatternVerificator patternVerificator = new PatternVerificator();
        patternVerificator.setAllStrings("password:Hid33m");

        String regex = "^password:[\\p{Upper}&\\p{Lower}&\\d[0,9]]\\w{1,10}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(currentPassword);

        Pattern pattern2 = Pattern.compile("\\w[A-Z]+");
        Matcher matcher2 = pattern2.matcher(currentPassword);
        Pattern pattern3 = Pattern.compile("\\w[a-z]+");
        Matcher matcher3 = pattern3.matcher(currentPassword);
        Pattern pattern4 = Pattern.compile("\\d[0-9]+");
        Matcher matcher4 = pattern4.matcher(currentPassword);


        String stringToBeReplaced = "UNSECURED";

        StringBuilder builder = new StringBuilder();

        while (matcher.find()) {
            if (matcher2.find()) {
                if (matcher3.find()) {
                    if (!matcher4.find()) {
                        matcher.appendReplacement(builder, stringToBeReplaced);
                        matcher.appendTail(builder);
                        System.out.println(stringToBeReplaced);
                    }
                } else {
                    matcher.appendReplacement(builder, stringToBeReplaced);
                    matcher.appendTail(builder);
                }
            } else {
                matcher.appendReplacement(builder, stringToBeReplaced);
                matcher.appendTail(builder);
            }
        }
        assertEquals("",builder.toString());

    }
    @Test
    public void testFalseWork(){
        String regex = "^password:\\w{1,10}$";
        Pattern pattern = Pattern.compile(regex);

        String password = "password:";

        String currentPassword = "6556665";

        String stringToBeMatched = password + currentPassword;

        Matcher matcher = pattern.matcher(stringToBeMatched);

        String stringToBeReplaced = "UNSECURED";
        StringBuilder builder = new StringBuilder();

        Pattern pattern2 = Pattern.compile("\\w[A-Z]+");
        Matcher matcher2 = pattern2.matcher(currentPassword);
        Pattern pattern3 = Pattern.compile("\\w[a-z]+");
        Matcher matcher3 = pattern3.matcher(currentPassword);
        Pattern pattern4 = Pattern.compile("\\d[0-9]+");
        Matcher matcher4 = pattern4.matcher(currentPassword);

        while (matcher.find()) {
            if (matcher2.find()) {
                if (matcher3.find()) {
                    if (!matcher4.find()) {
                        matcher.appendReplacement(builder, stringToBeReplaced);
                        matcher.appendTail(builder);
                        System.out.println(stringToBeReplaced);
                    }
                } else {
                    matcher.appendReplacement(builder, stringToBeReplaced);
                    matcher.appendTail(builder);
                }
            } else {
                matcher.appendReplacement(builder, stringToBeReplaced);
                matcher.appendTail(builder);
            }
        }

        assertEquals("UNSECURED", builder.toString());

    }

    @Test
    public void testMatches(){
        String regex = "^password:[\\p{Upper}&\\p{Lower}&\\d[0,9]]\\w{1,10}$";
        Pattern pattern = Pattern.compile(regex);

        PatternVerificator patternVerificator = new PatternVerificator();
        patternVerificator.toString();

        String currentPassword = "655666555555555";

        String stringToBeMatched = currentPassword;

        Matcher matcher = pattern.matcher(stringToBeMatched);

        assertFalse(matcher.matches());
    }
}