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
                Induction.main(null);
                break;

            case 2:
                BinaryRepresentation.main(null);
                break;

            case 3:
                Combinations.main(null);
                break;

            /* case 4:
                Ex4.main(null);
                break;

            case 5:
                Ex5.main(null);
                break;*/

            case 6:
                break;

            default:
                System.out.println("\nInvalid choice");
                choose();
                break;
        }
    }
}
