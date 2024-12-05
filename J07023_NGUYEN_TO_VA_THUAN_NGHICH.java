
/**
 *
 * @author HUNG
 */
import java.util.*;
import java.io.*;
public class J07023_NGUYEN_TO_VA_THUAN_NGHICH {
    public static boolean isPrime(int n){
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static boolean isTN(int n) {
        String s = String.valueOf(n);
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis1 = new FileInputStream("DATA1.in");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ois1.readObject();
        
        FileInputStream fis2 = new FileInputStream("DATA2.in");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ois2.readObject();

        int fre1[] = new int[10005];
        int fre2[] = new int[10005];
        
        for(int x : arr1) fre1[x]++;
        for(int x : arr2) fre2[x]++;
        
        for(int i =2; i <= 10000; i++){
            if(isPrime(i) && isTN(i) && fre1[i] > 0 && fre2[i] > 0){
                System.out.println(i + " " + fre1[i] + " " + fre2[i]);
            }
        }
        fis1.close();
        fis2.close();
        ois1.close();
        ois2.close();
    }
}