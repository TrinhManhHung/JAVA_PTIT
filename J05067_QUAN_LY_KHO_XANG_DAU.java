import java.util.*;

class Gas {
    private String id, name;
    private long amount, price, tax;
    //method
    public Gas(String id, long amount) {
        this.id = id;
        this.amount = amount;

        if(id.substring(3).equals("TN")) name = "Trong Nuoc";
        if(id.substring(3).equals("BP")) name = "British Petro";
        if(id.substring(3).equals("ES")) name = "Esso";
        if(id.substring(3).equals("SH")) name = "Shell";
        if(id.substring(3).equals("CA")) name = "Castrol";
        if(id.substring(3).equals("MO")) name = "Mobil";
    }

    public char MatHang(){
        return id.charAt(0);
    }

    public void DonGia(){
        if(MatHang() == 'X'){
            price = 128000;
            tax = price * amount * 3 / 100;
        }
        if(MatHang() == 'D'){
            price = 11200;
            tax = price * amount * 35 / 1000;
        }
        if(MatHang() == 'N'){
            price = 9700;
            tax = price * amount * 2 / 100;
        }
        if(id.substring(3).equals("TN")){
            tax = 0;
        }
    }

    public String toString(){
        DonGia();
        return this.id + " " + this.name + " " + this.price + " " + this.tax + " " + (this.price * this.amount + this.tax);
    }
}

public class J05067_QUAN_LY_KHO_XANG_DAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Gas> arr = new ArrayList<>();

        for(int i =1; i <=n; i++){
            sc.nextLine();
            Gas x = new Gas(sc.next(), sc.nextLong());
            arr.add(x);
        }

        for(Gas x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}

/*
3
N89BP 4500
D00BP 3500
X92SH 2600

N89BP British Petro 9700 87300 43737300
D00BP British Petro 11200 1372000 40572000
X92SH Shell 128000 9984000 342784000

N89BP British Petro 9700 873000 44523000
D00BP British Petro 11200 1372000 40572000
X92SH Shell 128000 9984000 342784000
 */