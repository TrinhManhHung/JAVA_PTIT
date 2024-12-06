//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;

public class J03030_BIEN_DOI_A_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] dpa = new int[n+1]; //dpa[i] so buoc it nhat bien xau s[0..i] thanh A
        int[] dpb = new int[n+1]; //dpb[i] so buoc it nhat bien xau s[0..i] thanh B
        
        if(s.charAt(0) == 'A'){
            dpa[0] = 0;
            dpb[0] = 1;
        }
        if(s.charAt(0) == 'B'){
            dpa[0] = 1;
            dpb[0] = 0;
        }
        
        for(int i =1; i <n; i++){
            if(s.charAt(i) == 'A'){
                dpa[i] = Math.min(dpa[i-1], dpb[i-1] + 1);
                dpb[i] = Math.min(dpa[i-1] +1, dpb[i-1] +1);
            }
            else if(s.charAt(i) == 'B'){
                dpa[i] = Math.min(dpa[i-1] +1, dpb[i-1] +1);
                dpb[i] = Math.min(dpa[i-1] +1, dpb[i-1]);
            }
        }
        
        System.out.println(dpa[n-1]);
        sc.close();
    }
}
