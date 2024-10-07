import java.util.*;

public class J02033_DAO_DAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i =0; i <n; i++){
            long x = sc.nextLong();
            pq.add(x);
        }
        while(k-- > 0){
            long minx = pq.poll();
            minx = -minx;
            pq.add(minx);
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        System.out.println(sum);
        sc.close();
    }
}