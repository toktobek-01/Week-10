import java.util.Scanner;

public class NumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int count = sc.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
    }
}