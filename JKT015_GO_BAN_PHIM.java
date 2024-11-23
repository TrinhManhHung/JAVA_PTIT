import java.util.*;

public class JKT015_GO_BAN_PHIM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i =0; i <s.length(); i++){
            if(s.charAt(i) == '<'){
                if(!stack1.empty()){
                    stack2.add(stack1.peek());
                    stack1.pop();
                }
            }
            else if(s.charAt(i) == '>'){
                if(!stack2.empty()){
                    stack1.add(stack2.peek());
                    stack2.pop();
                }
            }
            else if(s.charAt(i) == '-'){
                if(!stack1.empty()) stack1.pop();
            }
            else{
                stack1.add(s.charAt(i));
            }
        }

        while(!stack1.empty()){
            stack2.add(stack1.peek());
            stack1.pop();
        }
        while(!stack2.empty()){
            System.out.print(stack2.peek());
            stack2.pop();
        }
        sc.close();
    }
}