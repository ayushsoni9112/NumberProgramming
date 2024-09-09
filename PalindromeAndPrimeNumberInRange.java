import java.util.Scanner;

public class PalindromeAndPrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting Number:- ");
        int n = sc.nextInt();
        System.out.print("Enter end Number:- ");
        int n2 = sc.nextInt();
        while (n <= n2) {   
            if(isPalindrome(n) && isPrime(n)) 
            System.out.println(n +" is a Palindrome Number along with Prime Number.");
            n++;
        }
        System.out.println("End");
        sc.close();
    }
    public static boolean isPalindrome(int n) {
        int num = n;
        int rever = 0;
        while (n > 0) {
            int rem = n%10;
            rever = rever*10+rem;
            n/=10;
        }
        return num == rever;
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
