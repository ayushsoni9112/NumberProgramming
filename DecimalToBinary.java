import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println("Binary of " + n + " is " + getBinary(n) + ".");
        sc.close();
    }
    public static String getBinary(int n) {
        String bin = "";
        while (n > 0) {
            int rem = n%2;
            bin = rem + " " + bin;
            n/=2;
        }
        return bin;
    }
}
