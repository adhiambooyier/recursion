public class KCombinations {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvqxyz";

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        String letters = ALPHABET.substring(0, n);

        combine(letters, k, "");
    }

    private static void combine(String letters, int index, String collection) {
        if (index == 0) {
            System.out.println(collection);
            return;
        }
        for (int i = 0; i < letters.length(); i++)
            combine(letters, index - 1, collection + letters.charAt(i));
    }
}
