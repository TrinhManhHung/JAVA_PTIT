import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
    TreeSet<Integer> set;
    //method
    public IntSet(){

    }
    public IntSet(int a[]){
        set = new TreeSet<>();
        for(int x : a){
            set.add(x);
        }
    }
    public IntSet union (IntSet b){
        IntSet result = new IntSet();
        result.set = new TreeSet<>();
        for(int x : this.set){
            result.set.add(x);
        }
        for(int x : b.set){
            result.set.add(x);
        }
        return result;
    }
    public String toString (){
        String ans = "";
        for(int x : this.set){
            ans += x + " ";
        }
        return ans;
    }
}

public class J04021_LOP_INTSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
        sc.close();
    }
}
/*
5 6
1 2 3 4 5
3 4 5 6 7 8

1 2 3 4 5 6 7 8
 */
