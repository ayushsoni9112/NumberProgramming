public class ShiftAllZeroToLeft {
    public static void main(String[] args) {
        long n = 3005070906l;
        String op = "";
        while (n > 0) {
            long rem = n%10;
            if (rem == 0) {
                op = rem + op;
            } else {
                op=op+rem;
            }
            n/=10;
        }
        System.out.println(op);
    }
}