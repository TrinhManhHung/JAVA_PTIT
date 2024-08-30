import java.util.*;

class PhanSo {
    //Attribute
    private long tuSo;
    private long mauSo;
    //Method
    public long gcd (long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    PhanSo(long tuSo, long mauSo) {
        long uocChung = gcd(tuSo, mauSo);
        this.tuSo = tuSo / uocChung;
        this.mauSo = mauSo / uocChung;
    }
    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}


public class J04003_PHAN_SO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.println(x);
        sc.close();
    }
}