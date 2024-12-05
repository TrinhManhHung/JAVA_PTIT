import java.util.*;
import java.io.*;

public class J07031_CAP_SO_NGUYEN_TO_TRONG_FILE_2 {
    public static boolean isPrime(int n){
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n >= 2;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis1 = new FileInputStream("DATA1.in");
        FileInputStream fis2 = new FileInputStream("DATA2.in");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        ObjectInputStream ois2 = new ObjectInputStream(fis2);

        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();

        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        for(Integer x : arr1) set1.add(x);
        for(Integer x : arr2) set2.add(x);

        for(Integer n : set1){
            if(2*n > 1000000) break;
            int m = 1000000 - n;
            if(isPrime(n) && isPrime(m) && set1.contains(m) && !set2.contains(n) && !set2.contains(m)){
                System.out.println(n + " " + m);
            }
        }

        fis1.close();
        fis2.close();
    }
}