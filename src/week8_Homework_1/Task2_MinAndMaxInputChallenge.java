package week8_Homework_1;
import java.util.Scanner;
public class Task2_MinAndMaxInputChallenge {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
        }
        scanner.close();

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("error");
        } else {
            System.out.println("min: " + min);
            System.out.println("max: " + max);
        }

    }

}
