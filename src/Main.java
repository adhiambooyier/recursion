import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        choose();
    }

    private static void choose() {
        Scanner input = new Scanner(System.in);
        System.out.println("Recursion Exercises. Enter 1-10 to run\n");
        System.out.print("\n\t");
        int question = input.nextInt();
        switch (question) {
            case 1:
                NumberFamily.main(null);
                break;

            case 2:
                BinaryRepresentation.main(null);
                break;

            case 3:
                Combinations.main(null);
                break;

             case 4:
                Permutations.main(null);
                break;

            case 5:
                PancakeFlipping.main(null);
                break;
            case 6:
                HammingDistance.main(null);
                break;

            case 7:
                Collatz.main(null);
                break;

            case 8:
                break;

            default:
                System.out.println("\nInvalid choice");
                choose();
                break;
        }
    }
}
