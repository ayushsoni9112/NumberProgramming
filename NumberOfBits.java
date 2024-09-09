public class NumberOfBits {
    public static void main(String[] args) {
        int n = 43;
        String output = "";
        while (n > 0) {
            int rem = n%2;
            output = rem+output;
            n/=2;
        }
        System.out.println(output);
    }
}