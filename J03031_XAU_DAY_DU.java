import java.util.*;

public class J03031_XAU_DAY_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            //input
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            //process
            int[] dem = new int[26];
            for(int i =0; i <s.length(); i++){
                dem[(int)(s.charAt(i) - 'a')]++;
            }
            int cnt = 0;
            for(int i =0; i <26; i++){
                if(dem[i] == 0) cnt++;
            }
            //output
            if(cnt > k || s.length() < 26) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}

/*
2
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
4
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
24
 */
