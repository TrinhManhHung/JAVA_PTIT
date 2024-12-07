//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;

public class J08023_HINH_CHU_NHAT_LON_NHAT {
    public static void leftMin(long a[], int left[], int n){
        Stack<Integer> st = new Stack<>();
        for(int i =1; i <=n; i++){
            while(!st.empty() && a[i] <= a[st.peek()]){
                st.pop();
            }
            if(st.empty()) left[i] = 0;
            else left[i] = st.peek();
            st.push(i);
        }

    }
    public static void rightMin(long a[], int right[], int n){
        Stack<Integer> st = new Stack<>();
        for(int i =n; i >=1; i--){
            while(!st.empty() && a[i] <= a[st.peek()]){
                st.pop();
            }
            if(st.empty()) right[i] = n+1;
            else right[i] = st.peek();
            st.push(i);
        }
    }
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        long a[] = new long[n+1];
        for(int i =1; i <=n; i++) a[i] = sc.nextInt();
        int left[] = new int[n+1];
        int right[] = new int[n+1];
        leftMin(a, left, n);
        rightMin(a, right, n);
        //for(int x : left) System.out.println(x);
        long res = 0;
        for(int i =1; i <=n; i++){
            res = Math.max(res, (long)(right[i] - left[i] - 1)*a[i]);
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
2
7
6 2 5 4 5 1 6
3
2 2 2
*/