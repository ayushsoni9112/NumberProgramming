import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        //genrate a random number between 1 to 100
        int n =  (int) (Math.random()*100);
        System.out.println(n);
        //genrate a random number between 100 to 1000
        int n2 =  (int) (Math.random()*900)+100;
        System.out.println(n2);
        Random r1 = new Random();
        System.out.println(r1.nextInt());//random number between -2147983648 to 2147983647
        System.out.println(r1.nextInt(100));//random number between 0 to 100
        System.out.println(1000+(r1.nextInt(9999-1000))); //1000 to 9999
    }
}
