import java.util.*;

public class J08020_KIEM_TRA_DAY_NGOAC_DUNG {
    public static boolean Solve (String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i <s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else return false;
            }

            if(s.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '['){
                    stack.pop();
                }
                else return false;
            }

            if(s.charAt(i) == '}'){
                if(!stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }
                else return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String s = sc.nextLine();
            if(Solve(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
/*
2
[()]{}{[()()]()}
[(])

YES
NO
 */