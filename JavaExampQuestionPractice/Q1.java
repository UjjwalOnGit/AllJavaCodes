import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 num");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 0;

        for (int i = 2; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println(hcf);
    }
}