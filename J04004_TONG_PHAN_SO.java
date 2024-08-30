import java.util.*;

class PhanSo {
    //Attribute
    private long tuSo;
    private long mauSo;
    //Method
    PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    PhanSo (long tu, long mau){
        tuSo = tu;
        mauSo = mau;
    }
    public static long gcd (long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static long lcm (long a, long b){
        return a / gcd(a, b) * b;
    }
    public void plus (PhanSo a, PhanSo b){
        long mauChung = lcm(a.mauSo, b.mauSo);
        this.tuSo = mauChung / a.mauSo * a.tuSo + mauChung / b.mauSo * b.tuSo;
        this.mauSo = mauChung;
        long uocChung = gcd(tuSo, mauSo);
        this.tuSo = this.tuSo / uocChung;
        this.mauSo = this.mauSo / uocChung;
    }
    public void display(){
        System.out.println(this.tuSo + "/" + this.mauSo);
    }
}

public class J04004_TONG_PHAN_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo (sc.nextLong(), sc.nextLong());
        PhanSo b = new PhanSo (sc.nextLong(), sc.nextLong());
        PhanSo c = new PhanSo();
        c.plus(a, b);
        c.display();
        sc.close();
    }
}