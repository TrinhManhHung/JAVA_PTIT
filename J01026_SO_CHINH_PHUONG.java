import java.util.Scanner;

public class J01026_SO_CHINH_PHUONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            int can = (int)Math.sqrt(n);
            if(can * can == n) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
