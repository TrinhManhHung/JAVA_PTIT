import java.util.Scanner;
//System.out.println();
public class J01004_SO_NGUYEN_TO {
    public static boolean nt(int n){
        for(int i =2; i * i <=n; i++){
            if(n % i ==0) return false;
        }
        return n >1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            if(nt(n)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}