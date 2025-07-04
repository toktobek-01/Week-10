import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int count = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 1; i <= count; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num %2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("\nSummary");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        sc.close();
    }
}
