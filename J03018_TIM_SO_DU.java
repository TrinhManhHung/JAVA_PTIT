//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */

import java.util.*;

public class J03018_TIM_SO_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mod2[] = {0, 2, 4, 3, 1};
        int mod3[] = {0, 3, 4, 2, 1};
        int mod4[] = {0, 4, 1};
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String n_str = sc.nextLine();
            if(n_str.equals("0")) System.out.println(0);
            else{
                int n_mod_4 = 0;
                int n_mod_2 = 0;
                for(int i =0; i <n_str.length(); i++){
                    n_mod_4 = (n_mod_4 * 10 + (n_str.charAt(i) - '0')) % 4;
                    n_mod_2 = (n_mod_2 * 10 + (n_str.charAt(i) - '0')) % 2;
                }
                //System.out.println(n_mod_4 + " " + n_mod_2);
                if(n_mod_4 == 0) n_mod_4 = 4;
                if(n_mod_2 == 0) n_mod_2 = 2;
                int res = 1 + mod2[n_mod_4] + mod3[n_mod_4] + mod4[n_mod_2];
                System.out.println(res % 5);
            }
        }
        sc.close();
    }
}
/*
2
4
123456789
*/