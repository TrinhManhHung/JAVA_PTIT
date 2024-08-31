import java.util.*;

class Pair <A, B>{
    //Attribute
    private int first;
    private int second;
    //Method
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if both first and second are prime numbers
    public boolean isPrime() {
        return isPrime((int)this.first) && isPrime((int)this.second);
    }
    public String toString() {
        return this.first + " " + this.second;
    }
}
public class J04020_LOP_PAIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
