import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        if (isAutomorphic(n)) {
            System.out.println(n + " is a Automorphic Number:- ");
        } else {
            System.out.println(n + " is not a Automorphic Number:- ");
        }
        sc.close();
    }
    public static boolean isAutomorphic(int n) {
        String squire ="" + n*n;
        String s = Integer.toString(n);
        return squire.endsWith(s);
    }
}
