import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UOC_SO_CHUNG_LON_NHAT_CUA_SO_NGUYEN_LON {
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        else return gcd(b, a.mod(b));
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(gcd(a, b));
        }
        sc.close();
    }
}
