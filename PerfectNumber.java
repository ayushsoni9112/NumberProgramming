import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        if (isPerfect(n)) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }
        sc.close();
    }
    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i = 2; i <= n/2; i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        return n == sum+1;
    }
}
