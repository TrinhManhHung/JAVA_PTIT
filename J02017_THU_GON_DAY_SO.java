import java.util.*;

public class J02017_THU_GON_DAY_SO {
    public static boolean checkThuGon(int a, int b) {
        if(a % 2 != b % 2) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i =1; i <=n; i++){
            a[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for(int i =1; i <=n; i++){
            if(!st.empty() && checkThuGon(a[i], st.peek())){
                st.pop();
                continue;
            }
            st.push(a[i]);
        }
        System.out.println(st.size());
        sc.close();
    }
}