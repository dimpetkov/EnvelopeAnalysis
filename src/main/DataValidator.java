package main;

public class DataValidator {

    public static boolean isValidNumber(String input) {
        float data;
        try {
            data = Float.parseFloat(input);
            return data > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public static boolean responseAnalyze(String input) {
        if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) {
            return true;
        }
        return false;
    }
}
