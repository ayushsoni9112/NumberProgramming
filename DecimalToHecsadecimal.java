import java.util.*;

public class DecimalToHecsadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println(getHexa(n));
        sc.close();
    }
    public static String getHexa(int n) {
        int num = n;
        String h = "";
        while (n>0) {
            int rem = n%16;
            if (rem <= 9) {
                h = rem+h;
            }else {
                h = (char) (rem+87) + h;
            }
            n/=16;
        }
        return "HexaDecimal Number of "+num+" is " + h;
    }
}
