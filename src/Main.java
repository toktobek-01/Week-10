import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; ++i) {
            int x = sc.nextInt();
            a.add(x);
        }
        for(int i = 0; i < n; ++i){
            System.out.printf("%d ", a.get(i));
        }
    }
}