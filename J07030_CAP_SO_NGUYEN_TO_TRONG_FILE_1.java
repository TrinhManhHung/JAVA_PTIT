import java.util.*;
import java.io.*;

public class J07030_CAP_SO_NGUYEN_TO_TRONG_FILE_1 {
    public static boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();

        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        for(Integer x : arr1){
            if(checkPrime(x)) set1.add(x);
        }
        for(Integer x : arr2){
            if(checkPrime(x)) set2.add(x);
        }
        for(Integer n : set1){
            if(n * 2 >= 1000000) break;
            int m = 1000000 - n;
            if(set2.contains(m))
                System.out.println(n + " " + m);
        }
        ois1.close();
        ois2.close();
    }
}