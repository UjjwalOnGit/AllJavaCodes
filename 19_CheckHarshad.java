
import java.util.Scanner;

public class CheckHarshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), sum = 0, temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (n % sum == 0)
            System.out.println(n + " is a Harshad number");
        else
            System.out.println(n + " is not a Harshad number");
    }
}
