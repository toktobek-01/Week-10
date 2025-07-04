import java.util.Scanner;

public class EvenNumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int count = sc.nextInt();

        int evenCount = 0;

        for(int i = 1; i <= count; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = sc.nextInt();

            if(num %2 == 0) {
                evenCount++;
            }
        }
        System.out.println("You entered " + evenCount + " even number(s).");
        sc.close();
    }
}
