import java.util.Scanner;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values-");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Value " + i);
            a[i-1]=sc.nextInt();
        }
        System.out.println("Missing number is " + findMissing(a));
        sc.close();
    }
    public static int findMissing(int[] a) {
        int len = a.length+1;
        int totalSum = (len *(len+1))/2;
        int arraySum = 0;
        for (int i : a) {
            arraySum+=i;
        }
        return totalSum-arraySum;
    }
}
