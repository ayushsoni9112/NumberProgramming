import java.util.*;

public class OctalFromDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println("Octal value is "+getOctal(n));
        sc.close();
    }
    public static String getOctal(int n) {
        String res = "";
        while (n > 0) {
            int rem = n%8;
            res = rem+res;
            n/=8;
        }
        return res;
    }
}
