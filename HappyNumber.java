import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number:- ");
        } else {
            System.out.println(n + " is not a Happy Number:- ");
        }
        sc.close();
    }
    public static boolean isHappy(int n) {
        if (n == 7 || n == 1) {
            return true;
        }
        int sum = 0;
        while (n > 9) {

            while (n > 0) {
                int rem = n%10;
                sum += rem*rem;
                n/=10;
            }
            n = sum;
            sum = 0;
        }
        return n == 7 || n == 1;
    }
}
