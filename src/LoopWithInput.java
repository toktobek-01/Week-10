import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int n = scanner.nextInt();

        System.out.println("You etnered: ");
        for(int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ": ");
            int number = scanner.nextInt();
            System.out.println(number + " ");
        }
    }
}
