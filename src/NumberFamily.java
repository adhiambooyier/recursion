import com.sun.javafx.binding.SelectBinding;

import java.util.ArrayList;
import java.util.List;

public class NumberFamily {
    public static void main(String[] args) {
        int E = Integer.parseInt(args[0]);
        int O = Integer.parseInt(args[1]);

        // Generate E even numbers
        int i = 1;
        String evenS = "";
        String oddS = "";

        while (evenS.length() < E) {
            if (i % 2 == 0)
                evenS += i;
            i++;
        }
        System.out.println("Even: " + evenS);

        i = 1;
        while (oddS.length() < O) {
            if (i % 2 == 1)
                oddS += i;
            i++;
        }
        System.out.println("Odd: " + oddS);

        takePhotos(evenS, oddS, new ArrayList<>());
    }

    private static void takePhotos(String E, String O, List<StringBuilder> group) {
        StringBuilder combination = new StringBuilder();
        int nthEven = Integer.parseInt(E.substring(E.length() - 1));
        int nthOdd = Integer.parseInt(O.substring(O.length() - 1));

        if (nthEven < nthOdd) {
            combination.append(nthOdd);
            combination.append(E);
            group.add(combination);
            System.out.println(group);
        }

        for (int i = 0; i < (O.length()); i++)
            takePhotos(E.substring(i+1), O.substring(i+1), group);

    }

}
