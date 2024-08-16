import java.util.Scanner;

public class J01013_TONG_UOC_SO {
        public static void process(long[] sumPri){
            for(int i =2; i <=2000000; i++){
                if(sumPri[i] == 0){
                    for(int j =i; j <=2000000; j+=i){
                        int tmp = j;
                        while(tmp % i == 0){
                            tmp /= i;
                            sumPri[j] += i;
                        }
                    }
                }
            } 
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long[] sumPri = new long[2000005];
            process(sumPri);
    
            int t = sc.nextInt();
            long res = 0;
            while(t != 0){
                int a = sc.nextInt();
                res += sumPri[a];
                t--;
            }
            System.out.println(res);
        }
}
