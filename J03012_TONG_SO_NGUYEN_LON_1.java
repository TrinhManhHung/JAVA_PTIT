import java.util.*;
import java.math.BigInteger;

public class J03012_TONG_SO_NGUYEN_LON_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b));
        }
        sc.close();
    }
}
