import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class IntSet{
    TreeSet<Integer> set;
    //method
    public IntSet(){
        this.set = new TreeSet<>();
    }
    public IntSet(int[] a){
        this.set = new TreeSet<>();
        for(int x : a){
            this.set.add(x);
        }
    }

    public IntSet intersection(IntSet s2){
        IntSet res = new IntSet();
        for(int x : this.set){
            if(s2.set.contains(x)){
                res.set.add(x);
            }
        }
        return res;
    }
    public String toString(){
        String res = "";
        for(int x : this.set){
            res += x + " ";
        }
        return res.trim();
    }
}
public class J07009_LOP_INTSET_2 {

    public static void main4048703(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
        sc.close();
    }
}
