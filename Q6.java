import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, result = 0;

        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, 3);
            temp /= 10;
        }

        System.out.println((num == result) ? "Armstrong" : "Not Armstrong");
    }
}