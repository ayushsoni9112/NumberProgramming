import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        if(isPalindrome(n)) 
            System.out.println(n +" is a Palindrome Number.");
        else
            System.out.println(n +" is not a Palindrome Number.");
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
}
