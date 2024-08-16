import java.util.Scanner;

public class J01018_SO_KHONG_LIEN_KE {
        public static boolean Check(long n){
            long r = n % 10;
            long sum = r;
            n /= 10;
            while(n != 0){
                long tmp = n % 10;
                if(Math.abs(tmp - r) != 2){
                    return false;
                }
                r = tmp;
                sum += tmp;
                n /= 10;
            }
            return (sum % 10 == 0);
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
