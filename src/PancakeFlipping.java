import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PancakeFlipping {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        List<Integer> dataset = new Random().ints(n, 1, 100)
                .boxed().collect(Collectors.toList());
        flip(dataset, k, false);
    }

    private static void flip(List<Integer> dataset, int k, boolean decrement) {
        if (k == 0) return;
        System.out.println(dataset);

        List<Integer> flipList = new ArrayList<>(dataset.subList(0, k));
        List<Integer> restList = dataset.subList(k, dataset.size());
        int maxIndex = flipList.indexOf(Collections.max(flipList));

        if (maxIndex != flipList.size() - 1) {
            if (maxIndex == 0) {
                Collections.reverse(flipList);
            } else {
                List<Integer> subList = flipList.subList(0, maxIndex + 1);
                List<Integer> rest = flipList.subList(maxIndex + 1, flipList.size());
                Collections.reverse(subList);
                subList.addAll(rest);
                flipList = subList;
            }
        }

        flipList.addAll(restList);
        if (decrement) k--;
        flip(flipList, k, !decrement);
    }
}