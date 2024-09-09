import java.util.Scanner;

public class FascinatingNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isFascinating(n)) {
            System.out.println(n + " is a Fascinating Number.");
        } else {
            System.out.println(n + " is not a Fascinating Number.");
        }        
        sc.close();
    }

    public static boolean isFascinating(int n) {
        String str1 = Integer.toString(n);
        String str2 = Integer.toString(n * 2);
        String str3 = Integer.toString(n * 3);        
        String concatenated = str1 + str2 + str3;        
        return containsAllDigits(concatenated);
    }

    private static boolean containsAllDigits(String str) {
        boolean[] digits = new boolean[10];
        for (char c : str.toCharArray()) {
            if (c >= '1' && c <= '9') {
                digits[c - '0'] = true;
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (!digits[i]) {
                return false;
            }
        }        
        return true;
    }
}
