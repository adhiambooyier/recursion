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
        int n = Integer.parseInt(args[0]);
        String lettersToCombine = alphabet.substring(0, n);
        System.out.println(lettersToCombine);

        for (int i = n; i >= 0; i--)
            combine(lettersToCombine, i, "");
    }

    private static void combine(String letters, int n, String combination) {
        if (n == 0) {
            System.out.println(combination);
            return;
        }
        for (int i = 0; i < letters.length(); i++)
            combine(letters, n - 1, combination + letters.charAt(i));
    }
}
