package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    public void testRightlyWork() {
        String regex = "^password:\\w{1,10}$";
        Pattern pattern = Pattern.compile(regex);

        String password = "password:";

        String currentPassword = ";44dD";

        String stringToBeMatched = password + currentPassword;

        Matcher matcher = pattern.matcher(stringToBeMatched);

        String stringToBeReplaced = "UNSECURED";
        StringBuilder builder = new StringBuilder();


            while (currentPassword != null) {

                if (
                        currentPassword.contains("A") || currentPassword.contains("B") || currentPassword.contains("C") ||
                                currentPassword.contains("D") || currentPassword.contains("E") || currentPassword.contains("F") ||
                                currentPassword.contains("G") || currentPassword.contains("H") || currentPassword.contains("I") ||
                                currentPassword.contains("J") || currentPassword.contains("K") || currentPassword.contains("L") ||
                                currentPassword.contains("M") || currentPassword.contains("N") || currentPassword.contains("O") ||
                                currentPassword.contains("P") || currentPassword.contains("Q") || currentPassword.contains("R") ||
                                currentPassword.contains("S") || currentPassword.contains("T") || currentPassword.contains("U") ||
                                currentPassword.contains("V") || currentPassword.contains("W") || currentPassword.contains("X") ||
                                currentPassword.contains("Y") || currentPassword.contains("Z")) {
                    if (
                            currentPassword.contains("a") || currentPassword.contains("b") || currentPassword.contains("c") ||
                                    currentPassword.contains("d") || currentPassword.contains("e") || currentPassword.contains("f") ||
                                    currentPassword.contains("g") || currentPassword.contains("h") || currentPassword.contains("i") ||
                                    currentPassword.contains("j") || currentPassword.contains("k") || currentPassword.contains("l") ||
                                    currentPassword.contains("m") || currentPassword.contains("n") || currentPassword.contains("o") ||
                                    currentPassword.contains("p") || currentPassword.contains("q") || currentPassword.contains("r") ||
                                    currentPassword.contains("s") || currentPassword.contains("t") || currentPassword.contains("u") ||
                                    currentPassword.contains("v") || currentPassword.contains("w") || currentPassword.contains("x") ||
                                    currentPassword.contains("y") || currentPassword.contains("z")) {
                        if (
                                currentPassword.contains("0") || currentPassword.contains("1") ||
                                        currentPassword.contains("2") || currentPassword.contains("3") ||
                                        currentPassword.contains("4") || currentPassword.contains("5") ||
                                        currentPassword.contains("6") || currentPassword.contains("7") ||
                                        currentPassword.contains("8") || currentPassword.contains("9")) {
                            System.out.println("Password is secured!");
                            break;
                        } else {
                            System.out.println("Before Replacement: " + stringToBeMatched);
                            matcher.appendReplacement(builder, stringToBeReplaced);
                            matcher.appendTail(builder);
                            System.out.println("After Replacement: " + builder.toString());
                            break;
                        }
                    } else {
                        System.out.println("Before Replacement: " + stringToBeMatched);
                        matcher.appendReplacement(builder, stringToBeReplaced);
                        matcher.appendTail(builder);
                        System.out.println("After Replacement: " + builder.toString());
                        break;
                    }
                } else {
                    System.out.println("Before Replacement: " + stringToBeMatched);
                    matcher.appendReplacement(builder, stringToBeReplaced);
                    matcher.appendTail(builder);
                    System.out.println("After Replacement: " + builder.toString());
                    break;
                }
            }

        assertEquals("", builder.toString());
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


        while (matcher.find()) {

            if (
                    currentPassword.contains("A") || currentPassword.contains("B") || currentPassword.contains("C") ||
                            currentPassword.contains("D") || currentPassword.contains("E") || currentPassword.contains("F") ||
                            currentPassword.contains("G") || currentPassword.contains("H") || currentPassword.contains("I") ||
                            currentPassword.contains("J") || currentPassword.contains("K") || currentPassword.contains("L") ||
                            currentPassword.contains("M") || currentPassword.contains("N") || currentPassword.contains("O") ||
                            currentPassword.contains("P") || currentPassword.contains("Q") || currentPassword.contains("R") ||
                            currentPassword.contains("S") || currentPassword.contains("T") || currentPassword.contains("U") ||
                            currentPassword.contains("V") || currentPassword.contains("W") || currentPassword.contains("X") ||
                            currentPassword.contains("Y") || currentPassword.contains("Z")) {
                if (
                        currentPassword.contains("a") || currentPassword.contains("b") || currentPassword.contains("c") ||
                                currentPassword.contains("d") || currentPassword.contains("e") || currentPassword.contains("f") ||
                                currentPassword.contains("g") || currentPassword.contains("h") || currentPassword.contains("i") ||
                                currentPassword.contains("j") || currentPassword.contains("k") || currentPassword.contains("l") ||
                                currentPassword.contains("m") || currentPassword.contains("n") || currentPassword.contains("o") ||
                                currentPassword.contains("p") || currentPassword.contains("q") || currentPassword.contains("r") ||
                                currentPassword.contains("s") || currentPassword.contains("t") || currentPassword.contains("u") ||
                                currentPassword.contains("v") || currentPassword.contains("w") || currentPassword.contains("x") ||
                                currentPassword.contains("y") || currentPassword.contains("z")) {
                    if (
                            currentPassword.contains("0") || currentPassword.contains("1") ||
                                    currentPassword.contains("2") || currentPassword.contains("3") ||
                                    currentPassword.contains("4") || currentPassword.contains("5") ||
                                    currentPassword.contains("6") || currentPassword.contains("7") ||
                                    currentPassword.contains("8") || currentPassword.contains("9")) {
                        System.out.println("Password is secured!");
                        break;
                    } else {
                        System.out.println("Before Replacement: " + stringToBeMatched);
                        matcher.appendReplacement(builder, stringToBeReplaced);
                        matcher.appendTail(builder);
                        System.out.println("After Replacement: " + builder.toString());
                        break;
                    }
                } else {
                    System.out.println("Before Replacement: " + stringToBeMatched);
                    matcher.appendReplacement(builder, stringToBeReplaced);
                    matcher.appendTail(builder);
                    System.out.println("After Replacement: " + builder.toString());
                    break;
                }
            } else {
                System.out.println("Before Replacement: " + stringToBeMatched);
                matcher.appendReplacement(builder, stringToBeReplaced);
                matcher.appendTail(builder);
                System.out.println("After Replacement: " + builder.toString());
                break;
            }
        }

        assertEquals("UNSECURED", builder.toString());

    }

    @Test
    public void testMatches(){
        String regex = "^password:\\w{1,10}$";
        Pattern pattern = Pattern.compile(regex);

        Strings strings = new Strings();
        strings.toString();

        String password = "password:";

        String currentPassword = "655666555555555";

        String stringToBeMatched = password + currentPassword;

        Matcher matcher = pattern.matcher(stringToBeMatched);

        assertFalse(matcher.matches());
    }
}