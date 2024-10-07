import java.util.*;

public class J03019_XAU_CON_LON_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            while(!stack.empty() && s.charAt(i) > stack.peek()){
                stack.pop();
            }
            stack.push(s.charAt(i));
        }

        String res = "";
        while(!stack.empty()){
            res += stack.peek();
            stack.pop();
        }
        for(int i = res.length()-1; i >=0; i--){
            System.out.print(res.charAt(i));
        }
        sc.close();
    }
}

/*
 */