import java.util.Scanner;

public class DecimalFromOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println("Decimal value is "+getDecimal(n));
        sc.close();
    }
    public static String getDecimal(int n) {
        int res = 0;
        int eightMul = 1;
        while (n > 0) {
            int rem = n%10;
            if (rem > 7) {
                return "This is not a valid octal number";
            }
            res += eightMul*rem;
            eightMul = 8*eightMul;
            n/=10;
        }
        return res+" ";
    }
}
