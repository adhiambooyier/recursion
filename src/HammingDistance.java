import java.util.ArrayList;
import java.util.List;

public class HammingDistance {
    /*
    The Hamming distance between two bit strings of
length n is equal to the number of bits in which the two strings differ. Write a pro-
gram that reads in an integer k and a bit string s from the command line, and prints
all bit strings that have Hamming distance at most k from s . For example, if k is 2
and s is 0000 , then your program should print
0011 0101 0110 1001 1010 1100
Hint : Choose k of the bits in s to flip.
     */

    public static void main(String[] args) {
        String s = args[0];
        int k = Integer.parseInt(args[1]);
        flip(s, k);
    }

    private static void flip(String s, int k) {
        List<Integer> sList = new ArrayList<>();
        List<Integer> flipList = new ArrayList<>();
        List<Integer> unchangedList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++)
            sList.add(Integer.parseInt(s.substring(i, i+1)));
        System.out.println("s"+ sList);

        for (int i = 0; i < k; i++)
            flipList.add(sList.get(i));
        System.out.println("f"+flipList);

        for (int i = sList.size(); i > k; i--)
            unchangedList.add(sList.get(i-1));
        System.out.println("u"+unchangedList);

        for (int i = 0; i < flipList.size(); i++) {
            int targetInt = flipList.get(i);
            if (targetInt == 0) {
                newList.add((targetInt + 1));
            } else
                newList.add(targetInt - 1);
        }
        System.out.println("n" +newList);

        finalList.addAll(newList);
        finalList.addAll(unchangedList);

        System.out.println("fn" +finalList);
    }
}

