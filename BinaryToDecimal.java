import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number:- ");
        String binaryString = sc.nextLine();
        int decimalNumber = binaryToDecimal(binaryString);
        System.out.println("Decimal representation of binary " + binaryString + " is " + decimalNumber);
        sc.close();
    }
    public static int binaryToDecimal(String binaryString) {
        int decimalNumber = 0;
        int base = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char binaryDigit = binaryString.charAt(i);
            if (binaryDigit == '1') {
                decimalNumber += base;
            }
            base *= 2;
        }        
        return decimalNumber;
    }
}
