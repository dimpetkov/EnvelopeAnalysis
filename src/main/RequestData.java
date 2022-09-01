package main;

import java.util.Scanner;

public class RequestData {
    public static float getSide(String envelope, String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Envelope %s side %s: ", envelope, side);
        String envelopeSideInput = scanner.nextLine();
        float envelopeSide;
        while (!DataValidator.isValidNumber(envelopeSideInput)) {
            System.out.println("The allowed data type is: number");
            envelopeSideInput = scanner.nextLine();
        }
        envelopeSide = Float.parseFloat(envelopeSideInput);
        return envelopeSide;
    }

}
