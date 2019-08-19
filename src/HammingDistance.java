import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        int i = Integer.parseInt(args[2]);
        int j = Integer.parseInt(args[3]);

        System.out.println(select(s, k, i, j));

    }

    static String flip(char c) {
        if (c == '0') {
            return "1";
        } else {
            return "0";
        }
    }

    static List<String> select(String original, int k, int count, int skip) {
        count = 0;
        skip = 1;
        List<String> newList = new ArrayList<>();
        String flippedChar;

        if (count == 0) {
            flippedChar = flip(original.charAt(count));
            StringBuilder str = new StringBuilder(flippedChar);
            StringBuilder newString = str.append(original.substring(skip));
            newList.add(newString.toString());
            count++;
        } else {
            while (skip < k) {
                select(original, k, count, skip++);
            }
        }
        return newList;
    }

    static String flipS(String s, int i) {
        return s.substring(0, i) + flip(s.charAt(i)) + s.substring(i + 1);
    }

    static String[] hamming(String s, int k) {
        if (k > 1) {
            char c = s.charAt(s.length() - 1);
            List<String> s1;
            if (s.length() > k) {
                s1 = Arrays.stream(hamming(s.substring(s.length() - 1), k))
                        .map(y -> y + c)
                        .collect(Collectors.toList());
            } else {
                s1 = new ArrayList<>();
            }

            List<String> s2 = Arrays.stream(hamming(s.substring(s.length() - 1), k - 1))
                    .map(y -> y + flip(c))
                    .collect(Collectors.toList());

            List<String> r = new ArrayList<>(s1);
            r.addAll(s2);
            return r.toArray(new String[0]);
        }

        return IntStream.range(0, s.length())
                .mapToObj(i -> flipS(s, i))
                .toArray(String[]::new);
    }
}

