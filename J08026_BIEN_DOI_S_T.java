import java.util.*;

class Pair<A, B>{
    public A first;
    public B second;

    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }
}
public class J08026_BIEN_DOI_S_T{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while(test-- > 0){
            Queue<Pair<Integer, Integer>> q = new LinkedList<>();
            int s = sc.nextInt();
            int t = sc.nextInt();

            Set<Integer> visited = new HashSet<>();
            q.add(new Pair<>(s, 0));
            visited.add(s);
            while(true && !q.isEmpty()){
                Pair<Integer, Integer> top = q.poll();
                if(top.first == t){
                    System.out.println(top.second);
                    break;
                }
                if(top.first - 1 > 0 && !visited.contains(top.first - 1)){
                    q.add(new Pair<>(top.first - 1, top.second + 1));
                    visited.add(top.first - 1);
                }
                if(top.first < t && !visited.contains(top.first * 2)){
                    q.add(new Pair<>(top.first * 2, top.second + 1));
                    visited.add(top.first * 2);
                }
            }
        }
        sc.close();
    }
}
/*

 */