import java.util.Scanner;

public class SumAveragePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will you enter? ");

        int count = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= count; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum/count;

        System.out.println("Total sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
