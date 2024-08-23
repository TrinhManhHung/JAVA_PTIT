import java.math.BigInteger;
import java.util.Scanner;

public class J03039_CHIA_HET {
    public static boolean checkThuanNghich(String str){
        int size = str.length();
        for(int i =0; i <size; i++){
            if(str.charAt(i) != str.charAt(size - i - 1))
                return false;
        }
        return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.compareTo(b) > 0){
                if(a.mod(b).equals(BigInteger.ZERO)) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                if(b.mod(a).equals(BigInteger.ZERO)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}
