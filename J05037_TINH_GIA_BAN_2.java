import java.util.*;

class MatHang{
    private String id, name, dram;
    private int giaNhap, soLuong;
    //method
    public MatHang(int id, String name, String dram, int giaNhap, int soLuong){
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.dram = dram;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }

    public int phiVanChuyen(){
        double cost = this.giaNhap * this.soLuong * 5.0 / 100;
        return (int)Math.round(cost);
    }

    public int thanhTien(){
        return this.giaNhap * this.soLuong + this.phiVanChuyen();
    }

    public int giaBan(){
        double price = Math.ceil((this.thanhTien() * 102.0 / 100) / this.soLuong / 100) * 100;
        return (int)price;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.dram + " " + phiVanChuyen() + " " + thanhTien() + " " + giaBan();
    }
}
public class J05037_TINH_GIA_BAN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();

        for(int i =1; i <=n; i++){
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }


        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang a, MatHang b){
                return b.giaBan() - a.giaBan(); 
            }
        });

        for(MatHang x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
 */