import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p and q where p < q");
        int p = sc.nextInt();
        int q = sc.nextInt();

        while (p < q) {
            if (p % 10 == 7 || p % 7 == 0) {
                System.out.print(p + " ,");

            }
            p++;
        }

        sc.close();
    }
}
