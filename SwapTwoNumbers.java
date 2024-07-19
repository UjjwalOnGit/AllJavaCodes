import java.util.*;

public class SwapTwoNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : a to be swaped");
    int a = sc.nextInt();
    System.out.println("Enter a number : b to be swaped with a");
    int b = sc.nextInt();
    int swapVarible;

    // working

    swapVarible = a;
    a = b;
    b = swapVarible;

    System.out.println("a and b after swaping are : " + a + " : " + b);

    sc.close();
  }
}
