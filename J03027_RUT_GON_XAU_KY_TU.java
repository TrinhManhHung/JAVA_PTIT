import java.util.*;

public class J03027_RUT_GON_XAU_KY_TU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        
        for(int i =0; i <s.length(); i++){
            if(!stack.empty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }
            else stack.push(s.charAt(i));
        }

        if(stack.empty()){
            System.out.println("Empty String");
        }
        else{
            String res = "";
            while(!stack.empty()){
                res += stack.peek();
                stack.pop();
            }
            res = new StringBuilder(res).reverse().toString();
            System.out.println(res);
        }
        sc.close();
    }
}

/*
2
7
-7 1 5 2 -4 3 0
5
1 2 3 4 5
 */