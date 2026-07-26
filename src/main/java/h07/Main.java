package h07;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("----H7.3.2----");
        PeanoNumber six  = PeanoNumber.fromInt(6);
        PeanoNumber seven = PeanoNumber.fromInt(7);
        PeanoNumber sumRecursive = six.addRecursive(seven);
        int sumRecAsInt = sumRecursive.asIntRecursive();

        PeanoNumber sumIterative = six.addIterative(seven);
        int sumItAsInt = sumIterative.asIntIterative();

        System.out.println("SUM(6,7) recursively  = " + sumRecAsInt);
        System.out.println("SUM(6,7) iteratively = " + sumItAsInt);

    }
}
