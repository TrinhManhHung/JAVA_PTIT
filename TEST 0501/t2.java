import java.util.*;

public class t2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            ArrayList<Integer> open = new ArrayList<>();
            ArrayList<Integer> close = new ArrayList<>();
            for(int i =0; i <s.length(); i++){
                if(s.charAt(i) == '('){
                    open.add(i);
                }
                else if(s.charAt(i) == ')'){
                    close.add(i);
                }
            }

            boolean check = true;
            if(close.size() >= 2){
                for(int i =0; i <close.size()-1; i++){
                    if(close.get(i+1) == close.get(i) + 1 && open.get(i+1) == open.get(i) + 1){
                        check = false;
                    }
                }
            }

            if(!check) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}
/*
3
((a+b)+((c+d)))
(((a+(b)))+(c+d))
((a+b)+(c+d))

Yes
Yes
No
 */