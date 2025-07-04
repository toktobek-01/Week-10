import java.util.Scanner;
import java.util.ArrayList;

public class ArraysLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many numbers
        System.out.println("How many numbers do you want to enter?");
        int count = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Input numbers
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int value = sc.nextInt();
            numbers.add(value);
            sum += value;

            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Initialize min and max
        int min = numbers.get(0);
        int max = numbers.get(0);

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double average = (double) sum / numbers.size();

        // Output
        System.out.println("\nNumbers: " + numbers);
        System.out.println("Total sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        sc.close();
    }
}
