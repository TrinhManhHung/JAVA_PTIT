import java.math.BigInteger;
import java.util.*;

public class J08024_SO_0_VA_SO_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            BigInteger n = new BigInteger(sc.nextLine());
            Queue<String> queue = new LinkedList<>();
            queue.add("9");
            while(true){
                String top = queue.poll();
                BigInteger res = new BigInteger(top);
                if(res.mod(n).equals(BigInteger.ZERO)){
                    System.out.println(res.toString());
                    break;
                }
                queue.add(top + "0");
                queue.add(top + "9");
            }
        }
        sc.close();
    }
}