import java.util.*;

public class JKT013_SO_LOC_PHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test -- >0){
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            ArrayList<Long> arr = new ArrayList<>();
            q.add(6l); q.add(8l);
            while(true){
                Long top = q.poll();
                arr.add(top);
                Long nextNum = top * 10;
                if(nextNum >= Math.pow(10, n)){
                    break;
                }
                q.add(nextNum + 6);
                q.add(nextNum + 8);
            }
            while(!q.isEmpty()){
                arr.add(q.poll());
            }
            System.out.println(arr.size());
            for(int i =arr.size()-1; i >=0; i--){
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}