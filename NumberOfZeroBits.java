public class NumberOfZeroBits {
    public static void main(String[] args) {
        int n = 43;
        int count = 0;
        while (n > 0) {
            int rem = n%2;
            if (rem == 0) {
                count++;
            }
            n/=2;
        }
        System.out.println(count);
    }
}