import java.util.*;
import java.io.*;

public class J07032_SO_THUAN_NGHICH_TRONG_FILE {
    private static boolean check(int n)
    {
        String s = Integer.toString(n);
        if (s.length() == 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; ++i)
        {
            if (s.charAt(i) % 2 == 0)
                return false;
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis1 = new FileInputStream("DATA1.in");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();

        FileInputStream fis2 = new FileInputStream("DATA2.in");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();

        TreeSet<Integer> set1 = new TreeSet<>(arr1);
        TreeSet<Integer> set2 = new TreeSet<>(arr2);
        ArrayList<Integer> nums = new ArrayList<>();
        for(Integer x : set1){
            if(check(x) && set2.contains(x)){
                nums.add(x);
            }
            if(nums.size() == 10) break;
        }

        for(int i : nums) System.out.println(i + " " + (Collections.frequency(arr1, i) + Collections.frequency(arr2, i)));
        fis1.close();
        fis2.close();
    }
}