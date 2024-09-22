import java.util.*;
import java.math.BigInteger;

class PhanSo {
    private long tu, mau;
    //method
    public PhanSo(){
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public static long gcd(long a, long b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }

    public static PhanSo rutGon(PhanSo a) {
        long gcd = gcd(a.tu, a.mau);
        PhanSo ans = new PhanSo(a.tu / gcd, a.mau / gcd);
        return ans;
    }

    public PhanSo cal1(PhanSo b) {
        PhanSo res = new PhanSo();
        //res = A + B
        res.tu = this.tu * b.mau + b.tu * this.mau;
        res.mau = this.mau * b.mau;
        //res^2
        res.mau = res.mau * res.mau;
        res.tu = res.tu * res.tu;
        //rut gon
        res = rutGon(res);
        return res;
    } 

    public PhanSo cal2(PhanSo b, PhanSo c){
        PhanSo res = new PhanSo();
        //D = A * B * C 
        res.tu = this.tu * b.tu * c.tu;
        res.mau = this.mau * b.mau * c.mau;
        //rut gon
        res = rutGon(res);
        return res;
    }

    public String toString() {
        return this.tu + "/" + this.mau;
    }
}

public class J04014_TINH_TOAN_PHAN_SO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());

            PhanSo c = a.cal1(b);
            PhanSo d = a.cal2(b, c);

            System.out.println(c + " " + d);
        }
        sc.close();
    }
}
/*
2
1 2 3 4
2 3 4 5

25/16 75/128
484/225 3872/3375
 */