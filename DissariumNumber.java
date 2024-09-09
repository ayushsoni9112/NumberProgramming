import java.util.Scanner;

public class DissariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        if (isDissarium(n)) {
            System.out.println(n + " is a Dissarium Number:- ");
        } else {
            System.out.println(n + " is not a Dissarium Number:- ");
        }
        sc.close();
    }
    public static boolean isDissarium(int n) {
        int num = n;
        int sum = 0;
        int digit = countDigit(n);
        while (n > 0) {
            int rem = n%10;
            sum += Math.pow(rem, digit);
            digit--;
            n/=10;
        }
        return sum==num;
    }
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n/=10;
            count++;
        }
        return count;
    }
}
