import java.util.*;

public class J08021_DAY_NGOAC_DUNG_DAI_NHAT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String s = sc.nextLine();
            Stack<Integer> stack = new Stack<>();

            int res = 0;
            for(int i =0; i <s.length(); i++){
                if(s.charAt(i) == '(')
                    stack.add(i);
                else{
                    if(!stack.empty() && s.charAt(stack.peek()) == '('){
                        stack.pop();
                    }
                    else{
                        stack.add(i);
                    }
                }
            }

            int right = s.length();
            if(stack.empty()){
                System.out.println(s.length());
                return;
            }
            while(!stack.isEmpty()){
                res = Math.max(res, right - stack.peek() - 1);
                if(stack.size() == 1){
                    res = Math.max(res, stack.peek());
                }
                right = stack.peek();
                stack.pop();
            }
            System.out.println(res);
            sc.close();  
        }  
    }
}