import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07003_TACH_DOI_VA_TINH_TONG {
    public static void main(String[] args) throws FileNotFoundException {
        File fi = new File("DATA.in");
        Scanner sc = new Scanner(fi);
        String s = sc.next();
        if(s.length() == 1){
            System.out.println(s);
        }
        else{
            while(s.length() != 1){
                BigInteger left = new BigInteger(s.substring(0, s.length() / 2));
                BigInteger right = new BigInteger(s.substring(s.length()/2, s.length()));
                s = (left.add(right)).toString();
                System.out.println(s);
            }
        }
        sc.close();
    }
}

/*
 */