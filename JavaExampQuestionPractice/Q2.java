import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        int state = 0;
        while (num != 0) {
            if (num % 10 == 0) {
                state = 1;
            }
            num /= 10;
        }
        if (state == 1)
            System.out.println("DUCK");
        else
            System.out.println("NO DUCK");

        sc.close();
    }
}