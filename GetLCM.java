import java.util.*;
public class GetLCM {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=3; i++) {
            System.out.println("Enter number " + i);
            l1.add(sc.nextInt());
        }
        int lcms = LCMIs(l1.get(0), l1.get(1), l1.get(2));
        System.out.println("LCM of "+l1.get(0) + " and " + l1.get(1) + " and " + l1.get(2) + " is " + lcms);
        sc.close();
    }
    public static int LCMIs(int a, int b, int c) {
        int big = a > (b > c ? b : c) ? a : (b > c ? b : c);
        for(int i = big; ; i += big) {
            if (i%a==0 && i%b==0 && i%c==0) {
                return i;
            }
        }
        // return 0;
    }
}