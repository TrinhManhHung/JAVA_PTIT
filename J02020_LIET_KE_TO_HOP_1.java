import java.util.*;
//System.out.println();
public class J02020_LIET_KE_TO_HOP_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        int[] a = new int[k+1];
        for(int i =1; i <=k; i++) a[i] = i;
        int cnt = 0;
        while(true){
            cnt++;
            for(int i =1; i <=k; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
            
            int idx = k;
            while(idx >=1 && a[idx] == n - k + idx){
                idx--;
            }
            if(idx == 0) break;
            else{
                a[idx]++;
                for(int j =idx+1; j <=k; j++){
                    a[j] = a[j-1] + 1;
                }
            }
        }
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close(); 
    }
}
