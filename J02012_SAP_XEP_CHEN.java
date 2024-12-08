//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */

import java.util.*;

class Pair implements Comparable<Pair> {
    private int fi, se;
    //method
    public Pair(int fi, int se){
        this.fi = fi;
        this.se = se;
    }
    public int getFi() {
        return fi;
    }
    public int getSe() {
        return se;
    }
    
    @Override
    public int compareTo(Pair other){
        if(this.fi != other.fi) {
            return this.fi - other.fi;
        }
        return this.se - other.se;
    }
}
public class J02012_SAP_XEP_CHEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        TreeSet<Pair> set = new TreeSet<>();
        for(int i = 0; i <n; i++){
            set.add(new Pair(arr[i], i));
            System.out.print("Buoc " + i + ": ");
            for(Pair x : set){
                System.out.print(x.getFi() + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
/*
Buoc 0: 5
Buoc 1: 5 7
Buoc 2: 3 5 7
Buoc 3: 2 3 5 7
Buoc 0: 5 
Buoc 1: 5 7 
Buoc 2: 3 5 7 
Buoc 3: 2 3 5 7 
*/