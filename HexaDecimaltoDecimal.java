import java.util.Scanner;

public class HexaDecimaltoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal Number:- ");
        String n = sc.next();
        System.out.println(getDecimal(n));
        sc.close();
    }
    public static String getDecimal(String h) {
        int n = 0;
        int count = 0;
        for(int i = (h.toLowerCase()).length() - 1; i >= 0; i--) {
            char ch = h.charAt(i);
            if (ch <= '9') {
                n += (int) (ch-48) * Math.pow(16, count);
            } else if (ch >= 'a' && ch <= 'f') {
                n += (ch - 87) * Math.pow(16, count);
            } else {
                return "Enter a valid HexaDecimal Number.";
            }
            count++;
        }
        return "Decimal value of " + h + " is " + n;
    }
}
