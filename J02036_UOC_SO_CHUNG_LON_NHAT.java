import java.util.ArrayList;
import java.util.Scanner;

public class J02036_UOC_SO_CHUNG_LON_NHAT {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for(int i =0; i <n; i++){
                long x = sc.nextLong();
                arr.add(x);
            }
            System.out.print(arr.get(0) + " ");
            for(int i =1; i <n; i++){
                System.out.print(lcm(arr.get(i), arr.get(i-1)) + " ");
            }
            System.out.println(arr.get(arr.size() - 1));
        }
        sc.close();
    } 
}
