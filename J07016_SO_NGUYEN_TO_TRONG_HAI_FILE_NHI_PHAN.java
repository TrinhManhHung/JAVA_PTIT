//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;
import java.io.*;
public class J07016_SO_NGUYEN_TO_TRONG_HAI_FILE_NHI_PHAN {
    public static boolean isPrime(int n){
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis1 = new FileInputStream("DATA1.in");
        ObjectInputStream ios1 = new ObjectInputStream(fis1);
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ios1.readObject();

        FileInputStream fis2 = new FileInputStream("DATA2.in");
        ObjectInputStream ios2 = new ObjectInputStream(fis2);
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ios2.readObject();

        int cnt1[] = new int[10005];
        int cnt2[] = new int[10005];
        for(Integer x : arr1) if(isPrime(x)) cnt1[x]++;
        for(Integer x : arr2) if(isPrime(x)) cnt2[x]++;

        for(int i =1; i <=10000; i++){
            if(cnt1[i] != 0 && cnt2[i] != 0){
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
        ios1.close();
        ios2.close();
    }
}
/*
2
7
6 2 5 4 5 1 6
3
2 2 2
*/