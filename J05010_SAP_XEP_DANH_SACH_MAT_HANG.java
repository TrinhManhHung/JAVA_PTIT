import java.util.*;

class MatHang {
    private int id;
    private String name, group;
    private float mua, ban;
    private static int soLuong = 0;
    //method
    public MatHang(String name, String group, float mua, float ban) {
        soLuong++;
        this.id = soLuong;
        this.name = name;
        this.group = group;
        this.mua = mua;
        this.ban = ban;
    }
    public float getProfit() {
        return this.ban - this.mua;
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.group + " " + String.format("%.02f", this.getProfit());
    }
}

public class J05010_SAP_XEP_DANH_SACH_MAT_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            sc.nextLine();
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
            arr.add(x);
        }
        
        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang a, MatHang b) {
                if(a.getProfit() > b.getProfit())
                    return -1;
                return 1;
            }
        });

        for(MatHang x : arr) {
            System.out.println(x);
        }
        sc.close();
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37

2 Tu lanh Side by Side Dien lanh 7699.00
1 May tinh SONY VAIO Dien tu 1299.00
3 Banh Chocopie Tieu dung 9.50
 */