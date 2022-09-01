package main;

public class EnvelopeAnalysis {
    public static void compareEnvelopes(float xOne, float yOne, float xTwo, float yTwo) {

        if (Math.max(xOne, yOne) > Math.max(xTwo, yTwo)
                && Math.min(xOne, yOne) > Math.min(xTwo, yTwo)) {
            System.out.println("The second envelope may fit into the first one. ");
        } else if (Math.max(xOne, yOne) < Math.max(xTwo, yTwo)
                && Math.min(xOne, yOne) < Math.min(xTwo, yTwo)) {
            System.out.println("The first envelope may fit into the second one. ");
        } else {
            System.out.println("Envelopes do not fit into each other.");
        }
    }
}
