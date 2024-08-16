import java.util.Scanner;

public class J01017_SO_LIEN_KE {
        public static boolean Check(long n){
            long r = n % 10;
            n /= 10;
            while(n != 0){
                long tmp = n % 10;
                if(Math.abs(tmp - r) != 1){
                    return false;
                }
                r = tmp;
                n /= 10;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t != 0){
                long n = sc.nextLong();
                if(Check(n)) System.out.println("YES");
                else System.out.println("NO");
                t--;
            }
        }
}
