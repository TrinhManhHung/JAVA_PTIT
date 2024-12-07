//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;

public class J08012_HINH_SAO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i =0; i <n-1; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x] += 1;
            arr[y] += 1;
        }
        boolean check = false;
        for(int i =1; i <=n; i++){
            if(arr[i] == n-1){
                check = true;
                break;
            }
        }
        if(check) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}
/*
BANG DIEM MON Tin hoc co so 2:
B15DCKT199 Nguyen Trong Tung D15CQKT02-B 9
*/