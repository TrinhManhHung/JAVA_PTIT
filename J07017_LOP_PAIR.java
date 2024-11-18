import java.io.File;
import java.io.IOException;
import java.util.*;

class Pair<A, B>{
    private A first;
    private B second;
    //method
    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }
    private boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime() {
        if (first instanceof Integer && second instanceof Integer) {
            int firstNumber = (Integer) first;
            int secondNumber = (Integer) second;

            return isPrimeNumber(firstNumber) && isPrimeNumber(secondNumber);
        }
        return false; 
    }
    public String toString(){
        return this.first + " " + this.second;
    }
}
public class J07017_LOP_PAIR {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
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
    }
}
