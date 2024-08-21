import java.math.BigInteger;
import java.util.Scanner;

public class J03003_BOI_SO_CHUNG_NHO_NHAT {
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        return gcd(b, a.mod(b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(test <= t){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger res = (a.multiply(b)).divide(gcd(a, b));
            System.out.println(res);   
            test++;
        }
        sc.close();
    }
}
