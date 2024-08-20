import java.util.Scanner;

public class J01010_CAT_DOI {
    public static boolean check(long n) {
        long[] a = new long[2000];
        int socs = 0; 
        while (n > 0) {
            long r = n % 10;
            if (r == 1 || r == 0 || r == 8 || r == 9) {
                if(r == 1) 
                    a[socs] = 1; 
                else 
                    a[socs] = 0;
                socs++;
            } else {
                return false;
            }
            n /= 10;
        }

        long tmp = 0;
        for (int i = socs - 1; i >= 0; i--) {
            tmp = tmp * 10 + a[i];
        }
        if (tmp == 0) return false; 
        System.out.println(tmp);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (!check(n)) System.out.println("INVALID");
        }
        sc.close(); 
    }
}
