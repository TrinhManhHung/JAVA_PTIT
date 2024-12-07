//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;

class Pair<V, T>{
    V fi;
    T se;
    //method
    public Pair(V fi, T se) {
        this.fi = fi;
        this.se = se;
    }
    public V getFi() {
        return fi;
    }
    public T getSe() {
        return se;
    }
    
}
public class J08029_QUAN_MA {
    public static int dx[] = {-2, -2, -1, -1, 1, 1, 2, 2};
    public static int dy[] = {-1, 1, -2, 2, -2, 2, -1, 1};
    public static void solve(Scanner sc){
        String sta = sc.next().trim();
        String end = sc.next().trim();

        int xa = sta.charAt(0) - 'a' + 1;
        int ya = sta.charAt(1) - '0';
        int xb = end.charAt(0) - 'a' + 1;
        int yb = end.charAt(1) - '0';
        //System.out.println(xa + " " + ya + " " + xb + " " + yb);
        Queue<Pair<Integer, Integer>> Q = new LinkedList<>();
        Queue<Integer> step = new LinkedList<>();
        Q.add(new Pair<>(xa, ya));
        step.add(0);
        boolean check = false;
        int res = 0;
        while(!check){
            Pair<Integer, Integer> cur = Q.poll();
            int cur_x = cur.getFi();
            int cur_y = cur.getSe();
            int cur_step = step.poll();
            if(cur_x == xb && cur_y == yb){
                check = true;
                res = cur_step;
                break;
            }
            for(int i =0; i <8; i++){
                int next_x = cur_x + dx[i];
                int next_y = cur_y + dy[i];
                if(next_x >= 1 && next_x <=8 && next_y >=1 && next_y <=8){
                    if(next_x == xb && next_y == yb){
                        check = true;
                        res = cur_step + 1;
                        break;
                    }
                    else{
                        Q.add(new Pair<>(next_x, next_y));
                        step.add(cur_step+1);
                    }
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            solve(sc);
        }
        sc.close();
    }
}
/*
8
e2 e4
a1 b2
b2 c3
a1 h8
a1 h7
h8 a1
b1 c3
f6 f6
*/