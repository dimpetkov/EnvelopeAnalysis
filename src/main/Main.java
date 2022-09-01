package main;

import java.util.Scanner;

import static main.DataValidator.responseAnalyze;
import static main.EnvelopeAnalysis.compareEnvelopes;
import static main.RequestData.getSide;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, describe two envelopes, by their sides.\nAllowed data: numbers");

        boolean gameContinue = true;
        String input;
        while(gameContinue) {
            float firstEnvelopeSideX = getSide("One", "X");
            float firstEnvelopeSideY = getSide("One", "Y");
            float secondEnvelopeSideX = getSide("Two", "X");
            float secondEnvelopeSideY = getSide("Two", "Y");

            compareEnvelopes(firstEnvelopeSideX, firstEnvelopeSideY,
                    secondEnvelopeSideX, secondEnvelopeSideY);
            System.out.println("Do you want to continue, yes/no?");
            input = scanner.nextLine();
            gameContinue = responseAnalyze(input);
        }
    }
}
