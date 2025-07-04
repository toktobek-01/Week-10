import java.util.Scanner;

public class SumAverageChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number?");
        int count = scanner.nextInt();

        int sum = 0;

        for(int i = 0; i <= count; i++) {
            System.out.println("Enter number: " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        scanner.close();


    }
}
