//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.io.IOException;
import java.util.*;

public class J020356_LUA_CHON_THAM_LAM {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int s1 = s;
        if((n > 1 && s == 0)  || s > 9*n) System.out.println("-1 -1");
        else{
            int[] mi = new int[n];
            int[] ma = new int[n];
            int idx = 0;
            while(s > 0 && idx >= 0){
                if(s >= 9) ma[idx] = 9;
                else ma[idx] = s;
                s -= Math.min(s, 9);
                idx++;
            }
            mi[0] = 1;
            s1 -= 1;
            idx = n-1;
            while(s1 > 0 && idx >= 0){
                if(s1 >= 9) mi[idx] = 9;
                else mi[idx] += s1;
                s1 -= Math.min(s1, 9);
                idx--;
            }
            
            for(int i =0; i <n; i++){
                System.out.print(mi[i]);
            }   
            System.out.print(" ");
            for(int i =0; i <n; i++){
                System.out.print(ma[i]);
            }               
        }
        sc.close();
    }
}