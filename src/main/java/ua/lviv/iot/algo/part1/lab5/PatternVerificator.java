package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternVerificator {
    public static final String PASSWORD_REGEX =
            "^password:[\\p{Upper}&\\p{Lower}&\\d[0,9]]\\w{1,10}$";

//    public static void main(String[] args) {
//        PatternVerificator patternVerificator = new PatternVerificator();
//        System.out.println("\n1");
//        patternVerificator.setAllStrings("password:dDD");
//        System.out.println("\n2");
//        patternVerificator.setAllStrings("password:Ddd66F");
//        System.out.println("\n3");
//        patternVerificator.setAllStrings("password:uU55");
//    }

    public String setAllStrings(String currentPassword) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);

        Matcher matcher = pattern.matcher(currentPassword);

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
        return stringToBeReplaced;
    }
}