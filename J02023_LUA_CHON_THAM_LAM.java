import java.util.Scanner;

public class J02023_LUA_CHON_THAM_LAM {
    public static void soNhoNhat(int n, int s){
        int[] a = new int[n+1];
        a[1] = 1; s -= 1;
        int idx = n;
        while(idx >= 1){
            a[idx] += Math.min(s, 9);
            s -= a[idx];  
            idx--;         
        }
        for(int i=1; i <=n; i++) System.out.print(a[i]);
    }
    public static void soLonNhat(int n, int s){
        int[] a = new int[n+1];
        int idx = 1;
        while(idx <= n){
            a[idx] = Math.min(s, 9);
            s -= a[idx];
            idx++;
        }
        for(int i=1; i <=n; i++) System.out.print(a[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        if((n > 1 && s == 0) || (s > 9 * n)){
            System.out.println("-1 -1");
        } 
        else{
            soNhoNhat(n, s);
            System.out.print(" ");
            soLonNhat(n, s);
        }
        sc.close();
    }
}
