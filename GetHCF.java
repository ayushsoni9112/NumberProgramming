import java.util.*;
public class GetHCF {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=3; i++) {
            System.out.println("Enter number " + i);
            l1.add(sc.nextInt());
        }
        int hcfs = HCFIs(l1.get(0), l1.get(1), l1.get(2));
        System.out.println("HCF of "+l1.get(0) + " and " + l1.get(1) + " and " + l1.get(2) + " is " + hcfs);
        sc.close();
    }
    public static int HCFIs(int a, int b, int c) {
        int small = a < (b < c ? b : c) ? a : (b < c ? b : c);
        for(int i = small; ; i--) {
            if (a%i==0 && b%i==0 && c%i==0) {
                return i;
            }
        }
        // return 0;
    }
}