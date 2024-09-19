import java.util.*;

class MatHang{
    private String id, name;
    private long quantity, price; 
    //method
    public MatHang(String id, String name, long quantity, long price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getMoney() {
        return this.price * this.quantity;
    }

    public double getDiscount() {
        double tam = (double)this.getMoney();
        if(this.quantity > 10){
            return tam * 5 / 100;
        }
        if(this.quantity >= 8){
            return tam * 2 / 100;
        }
        if(this.quantity >= 5){
            return tam * 1 / 100;
        }
        return 0;
    }

    public String toString() {
        return this.id + " " + this.name + " " + (int)this.getDiscount() + " " + (int)(this.getMoney() - this.getDiscount());
    }
}

public class J05047_BANG_KE_NHAP_KHO_SAP_XEP_THEO_CHIET_KHAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i =1; i <=n; i++) {
            sc.nextLine();
            //solve id
            String name = sc.nextLine();
            String[] words = name.toUpperCase().trim().split("\\s+");
            String id = words[0].substring(0, 1) + words[1].substring(0, 1);

            if(map.containsKey(id)){
                int tanSuat = map.get(id);
                map.put(id, tanSuat + 1);
            }
            else{
                map.put(id, 1);
            }
            id += String.format("%02d", map.get(id));
            //
            MatHang x = new MatHang(id, name, sc.nextLong(), sc.nextLong());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang a, MatHang b) {
                if(a.getDiscount() > b.getDiscount()){
                    return -1;
                }
                return 1;
            }
        });
        for(MatHang x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000

ML01 May lanh SANYO 2400000 45600000
DT01 Dien thoai Samsung  4845000 92055000
DT02 Dien thoai Nokia 1116000 21204000
 */