import java.util.ArrayList;
import java.util.Scanner;

class MatHang{
    private String id, name, type;
    //method
    public MatHang(String id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId(){
        return this.id;
    }
    public long profit(){
        if(this.type.equals("A")){
            return 8;
        }
        if(this.type.equals("B")){
            return 5;
        }
        return 2;
    }

    public String toString(){
        return this.id + " " + this.name + " ";
    }
}

class DonHang{
    private String id;
    private long soLuongNhap, giaNhap, soLuongXuat;
    //method
    public DonHang(String id, long soLuongNhap, long giaNhap, long soLuongXuat){
        this.id = id;
        this.soLuongNhap = soLuongNhap;
        this.soLuongXuat = soLuongXuat;
        this.giaNhap = giaNhap;
    }

    public String getId(){
        return this.id;
    }

    public long giaTriNhap(){
        return this.soLuongNhap * this.giaNhap;
    }

    public long giaTriXuat(){
        return this.soLuongXuat * this.giaNhap;
    }
}
public class J05076_NHAP_XUAT_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> arr1 = new ArrayList<>();
        ArrayList<DonHang> arr2 = new ArrayList<>();

        for(int i =1; i <=n; i++){
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }

        int m = sc.nextInt();
        sc.nextLine();
        for(int i =1; i <=m; i++){
            DonHang x = new DonHang(sc.next(), Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next()));
            arr2.add(x);
        }

        for(DonHang x : arr2){
            for(MatHang y : arr1){
                if(y.getId().equals(x.getId())){
                    System.out.print(y);
                    System.out.println(x.giaTriNhap() + " " + x.giaTriXuat() * (100 + y.profit()) / 100);
                    break;
                }
            }
        }
        sc.close();
    }
}