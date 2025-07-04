import java.util.Scanner;

public class NumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Input numbers
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // Now safe to initialize min/max
        int max = numbers[0];
        int min = numbers[0];

        // Analyze numbers
        for (int i = 0; i < count; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];

            if (numbers[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        // Sort numbers (ascending)
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (numbers[i] < numbers[j]) {  // compare for descending
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Output
        double average = (double) sum / count;

        System.out.println("You entered these numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Sorted numbers in descending order:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest number: " + max);
        System.out.println("Lowest number: " + min);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        sc.close();
    }
}
