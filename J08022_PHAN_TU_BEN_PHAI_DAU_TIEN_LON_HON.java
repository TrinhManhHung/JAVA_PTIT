import java.util.*;

public class J08022_PHAN_TU_BEN_PHAI_DAU_TIEN_LON_HON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i =1; i <=n; i++) {
                a[i] = sc.nextInt();
            }

            int[] minRight = new int[n+1];
            Stack<Integer> stack = new Stack<>();
            for(int i =n; i >=1; i--) {
                while(!stack.empty() && a[i] >= stack.peek()){
                    stack.pop();
                }
                if(stack.empty() == true)
                    minRight[i] = -1;
                else {
                    minRight[i] = stack.peek();
                }
                stack.push(a[i]);
            }

            for(int i =1; i <=n; i++){
                System.out.print(minRight[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
3
4
4 5 2 25
3
2 2 2
4
4 4 5 5

5 25 25 -1
-1 -1 -1
5 5 -1 -1
 */