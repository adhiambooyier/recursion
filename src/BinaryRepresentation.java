import java.util.ArrayList;
import java.util.List;

public class BinaryRepresentation {
    /*Binary representation. Write a program that takes a positive integer n (in
decimal) as a command-line argument and prints its binary representation. Use
the following simpler method: repeatedly divide 2 into n and read the remainders
backward. First, write a while loop to carry out this computation and print the bits
in the wrong order. Then, use recursion to print the bits in the correct order.*/
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> wrongOrderBits = new ArrayList<>();

        while (n >= 1) {
            int quotient = n / 2;
            int remainder = n % 2;
            wrongOrderBits.add(remainder);
            n = quotient;
        }
        System.out.println(wrongOrderBits);
        print(wrongOrderBits, wrongOrderBits.size() - 1);
    }

    private static void print(List<Integer> bits, int index) {
        if (index < bits.size() && index >= 0) {
            System.out.print(bits.get(index));
            print(bits, --index);
        }
    }
}
