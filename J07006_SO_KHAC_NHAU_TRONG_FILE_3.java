//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;
import java.io.*;

public class J07006_SO_KHAC_NHAU_TRONG_FILE_3 {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        int cnt[] = new int[1005];
        for(Integer x : arr){
            cnt[x]++;
        }
        for(int i =0; i <=1000; i++){
            if(cnt[i] != 0) System.out.println(i + " " + cnt[i]);
        }
        ois.close();
    }
}