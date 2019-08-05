public class Permutations {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvqxyz";

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
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
            permute(letters, index, collection + letters.charAt(i));
    }
}
