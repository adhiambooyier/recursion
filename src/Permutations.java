import java.util.Scanner;

public class Permutations {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvqxyz";
    private static int n;
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number n: ");
            n = input.nextInt();
        String letters = ALPHABET.substring(0, n);
        for (int i = n; i >= 0; i--)
            permute(letters, i, "");
    }

    private static void permute(String letters, int index, String collection) {
        if (index == 0) {
            System.out.println(collection);
            return;
        }
        for (int i = 0; i < letters.length(); i++)
            permute(letters, index - 1, collection + letters.charAt(i));
    }
}
