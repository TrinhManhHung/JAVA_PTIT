import java.util.*;

public class JKT014_DAU_TU_CHUNG_KHOAN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n+1];
            for(int i =1; i <=n; i++){
                arr[i] = sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            for(int i =1; i <=n; i++){
                while(!stack.empty() && arr[i] >= arr[stack.peek()]){
                    stack.pop();
                }
                if(stack.empty()){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print((i - stack.peek()) + " ");
                }
                stack.push(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
