import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i < 10 ; i++){
            System.out.println("enter :"+i+"th element in your array");
            int arr[i] = sc.nextInt();

            System.out.println(arr);
        }
    }
}
