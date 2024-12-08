//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */

import java.util.*;

public class J02019_TONG_UOC_SO_2 {
    public static int[] sumPrime = new int[1000005];
    public static void sangNt(){
        for(int i =2; i <=500000; i++){
            for(int j = i*2; j <=1000000; j+=i){
                sumPrime[j] += i;
            }
        }
    }
    public static void main(String[] args) {
        sangNt();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int res = 0;

        for(int i = a; i <=b; i++){
            if(sumPrime[i] + 1 > i) res++;
        }    
        System.out.println(res);
        sc.close();
    }
}
/*
BANG DIEM MON Tin hoc co so 2:
B15DCKT199 Nguyen Trong Tung D15CQKT02-B 9
*/