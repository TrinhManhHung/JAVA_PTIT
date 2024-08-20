import java.util.*;
//System.out.println();
public class J02021_LIET_KE_TO_HOP_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        int[] a = new int[k+1];
        for(int i =0; i <k; i++) a[i] = i+1;
        int cnt = 0;
        while(true){
            cnt++;
            for(int i =0; i <k; i++){
                System.out.print(a[i]);
            }
            System.out.print(" ");
            
            int idx = k-1;
            while(idx >=0 && a[idx] == n - k + idx+1){
                idx--;
            }
            if(idx == -1) break;
            else{
                a[idx]++;
                for(int j =idx+1; j <k; j++){
                    a[j] = a[j-1] + 1;
                }
            }
        }
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close(); 
    }
}