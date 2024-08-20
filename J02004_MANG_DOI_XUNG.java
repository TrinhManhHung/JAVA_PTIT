import java.util.Scanner;
//System.out.println();
public class J02004_MANG_DOI_XUNG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i =1; i <=n; i++){
                a[i] = sc.nextInt();
            }
            boolean check = true;
            for(int i =1; i <= n/2; i++){
                int j = n - i + 1;
                if(a[i] != a[j]) check = false;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close(); 
    }
}