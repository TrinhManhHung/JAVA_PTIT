import java.util.*;

class MatHang {
    private String id;
    private long in, out, price, money, tax;
    //method
    public MatHang(String id, long in) {
        this.id = id.trim();
        this.in = in;
        //out
        if(id.charAt(0) == 'A')
            this.out = (long)Math.round(this.in * 60.0 / 100);
        if(id.charAt(0) == 'B')
            this.out = (long)Math.round(this.in * 70.0 / 100);
        //price
        if(this.id.charAt(id.length()-1) == 'Y')
            this.price = 110000;
        if(this.id.charAt(id.length()-1) == 'N')
            this.price = 135000;
        //money
        this.money = this.out * this.price;
        //tax
        char start = this.id.charAt(0); char end = this.id.charAt(id.length()-1);
        if(start == 'A' && end == 'Y'){
            this.tax = this.money * 8 / 100;
        }
        else if(start == 'A' && end == 'N'){
            this.tax = this.money * 11 / 100;
        }
        else if(start == 'B' && end == 'Y'){
            this.tax = this.money * 17 / 100;
        }
        else if(start == 'B' && end == 'N'){
            this.tax = this.money * 22 / 100;
        }
    }

    public long getTax() {
        return this.tax;
    }

    public String getId() {
        return this.id.substring(0, 1);
    }

    public String toString(){
        return this.id + " " + this.in + " " + this.out + " " + this.price + " " + this.money + " " + this.tax;
    }    
}

public class J05049_LIET_KE_NHAP_XUAT_HANG_THEO_NHOM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <MatHang> arr = new ArrayList<>();
        
        for(int i =0; i <n; i++) {
            sc.nextLine();
            MatHang x = new MatHang(sc.nextLine(), sc.nextLong());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang a, MatHang b) {
                return (int)(b.getTax() - a.getTax());
            }
        });

        sc.nextLine();
        String ma = sc.nextLine();
        for(MatHang x : arr){
            if(x.getId().equals(ma))
                System.out.println(x);
        }
        sc.close();
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
B

B003Y 4582 3207 110000 352770000 59970900
B012N 2500 1750 135000 236250000 51975000
 */