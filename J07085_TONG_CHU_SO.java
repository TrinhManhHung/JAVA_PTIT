//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;
import java.io.*;

public class J07085_TONG_CHU_SO {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> arr = new ArrayList<>();
//        for(int i =0; i <2; i++){
//            arr.add(sc.nextLine());
//        }
        for(String x : arr){
            String res = "";
            boolean checkFirst = false;
            boolean have0 = false;
            int sumDigit = 0;
            for(int i =0; i <x.length(); i++){
                if(x.charAt(i) >= '0' && x.charAt(i) <= '9'){
                    if(x.charAt(i) == '0'){
                        have0 = true;
                    }
                    else{
                        checkFirst = true;
                    }
                    if(checkFirst){
                        res += x.charAt(i);
                        sumDigit += x.charAt(i) - '0';
                    }
                }
            }
            if(res.length() > 0){
                System.out.println(res + " " + sumDigit);
            }
            else{
                if(have0) System.out.println("0 0");
                else System.out.println("");
            }
        }
        ois.close();
    }
}