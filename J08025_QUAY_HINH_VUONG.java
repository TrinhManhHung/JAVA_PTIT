import java.util.*;

class Pair{
    public String fi;
    public Integer se;
    //method
    public Pair(String fi, Integer se){
        this.fi = fi;
        this.se = se;
    }
}
public class J08025_QUAY_HINH_VUONG{
    public static String LeftRotate(String s){
        String news = String.valueOf(s.charAt(3)) + String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(2)) + String.valueOf(s.charAt(4)) + String.valueOf(s.charAt(1)) + String.valueOf(s.charAt(5));
        return news;
    }
    public static String RightRotate(String s){
        String news = String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(4)) + String.valueOf(s.charAt(1)) + String.valueOf(s.charAt(3)) + String.valueOf(s.charAt(5)) + String.valueOf(s.charAt(2));
        return news;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input    
        int test = sc.nextInt();
        while(test-- > 0){
            String s = "", res = "";
            for(int i =0; i <6; i++){
                String x = sc.next();
                s += x;
            }
            for(int i =0; i <6; i++){
                String x = sc.next();
                res += x;
            }
            //solve
            Set<String> set = new HashSet<>();
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(s, 0));
            set.add(s);
            while(!q.isEmpty()){
                String current = q.peek().fi;
                int steps = q.peek().se;
                q.remove();
                if(current.equals(res)){
                    System.out.println(steps);
                    break;
                }
                String new1 = LeftRotate(current);
                String new2 = RightRotate(current);
                if(!set.contains(new1)){
                    q.add(new Pair(new1, steps + 1));
                    set.add(new1);
                }
                if(!set.contains(new2)){
                    q.add(new Pair(new2, steps + 1));
                    set.add(new2);
                }
            }
        }
        sc.close();
    }
}
/*

 */