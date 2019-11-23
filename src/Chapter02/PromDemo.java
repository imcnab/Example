package Chapter02;

// A promotion surprise!
public class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        // No cast needed because result is already elevated to int.
        b = 10;
        i = b * b; // OK, no cast needed

        //Cast is needed here to assign an int to a byte!
        b = 10;
        b = (byte) (b * b); // cast needed!!
        System.out.println("i and b: " + i + " " + b);
    }
}
