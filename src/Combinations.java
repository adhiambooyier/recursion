import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations {
    /*
    Combinations. Write a program Combinations that takes an integer command-line argument n
    and prints all 2 n combinations of any size. A combination is
    a subset of the n elements, independent of order. As an example, when n = 3, you
    should get the following output:
    a ab abc ac b bc c
    Note that your program needs to print the empty string (subset of size 0).
     */

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = input.nextInt();
        List<String> lettersToCombine = new ArrayList<>();
        while (n >= 1) {
            String letter = Character.toString(alphabet.charAt(n - 1));
            lettersToCombine.add(letter);
            n = n - 1;
        }
        System.out.println(lettersToCombine.toString());
        combine(lettersToCombine, n);
    }

    private static void combine(List<String> letters, int n) {
        if (n == 1){
            System.out.println(letters.get(n));
        }
        combine(letters, --n);
    }
}
