import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HoaDon {
    private String id, idKH, idMH;
    private KhachHang khachHang;
    private MatHang matHang;
    private long amount;
    //method
    public HoaDon(int id, String idKH, String idMH, long amount){
        this.id = "HD" + String.format("%03d", id);
        this.idKH = idKH;
        this.idMH = idMH;
        this.amount = amount;
    }

    public String getIdKH(){
        return this.idKH;
    }
    public String getIdMH(){
        return this.idMH;
    }

    public void setMatHang(MatHang x){
        this.matHang = x;
    }
    public void setKhachHang(KhachHang x){
        this.khachHang = x;
    }

    public long thanhTien(){
        return this.amount * matHang.getGiaBan();
    }
    public long loiNhuan(){
        return this.amount * (matHang.getGiaBan() - matHang.getGiaMua());
    }
    public String toString(){
        return this.id + " " + this.khachHang + " " + this.matHang + " " + amount + " " + thanhTien() + " " + loiNhuan();
    }
}


class KhachHang {
    private String id, name, sex, birth, addr;
    //method
    public KhachHang(int id, String name, String sex, String birth, String addr){
        this.id = "KH" + String.format("%03d", id);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.addr = addr;
    }
    public String getId(){
        return this.id;
    }
    public String getBirth(){
        return this.birth;
    }
    public String getSex(){
        return this.sex;
    }
    public String toString(){
        return this.name + " " + this.addr;
    }
}

class MatHang {
    private String id, name, unit;
    private long giaMua, giaBan;
    //method
    public MatHang(int id, String name, String unit, long giaMua, long giaBan){
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.unit = unit;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getId(){
        return this.id;
    }
    public long getGiaMua(){
        return this.giaMua;
    }
    public long getGiaBan(){
        return this.giaBan;
    }
    public String getUnit(){
        return this.unit;
    }
    public String toString(){
        return this.name;
    }
}

public class J06006_QUAN_LY_BAN_HANG_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<KhachHang> arrKH = new ArrayList<>();
        ArrayList<MatHang> arrMH = new ArrayList<>();
        ArrayList<HoaDon> arrHD = new ArrayList<>();
        //nhap KH
        int n = Integer.parseInt(sc.nextLine());
        for(int i =1; i <=n; i++){
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrKH.add(x);
        }
        //nhap MH
        int m = Integer.parseInt(sc.nextLine());
        for(int i =1; i <=m; i++){
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            arrMH.add(x);
        }
        //Nhap HD
        int k = Integer.parseInt(sc.nextLine());
        for(int i =1; i <=k; i++){
            HoaDon x = new HoaDon(i, sc.next(), sc.next(), Long.parseLong(sc.next()));
            arrHD.add(x);
        }

        for(HoaDon x : arrHD){

            String idKH = x.getIdKH();
            String idMH = x.getIdMH();
            for(KhachHang y : arrKH){
                if(y.getId().equals(idKH)){
                    x.setKhachHang(y);
                    break;
                }
            }
            for(MatHang z : arrMH){
                if(z.getId().equals(idMH)){
                    x.setMatHang(z);
                    break;
                }
            }
        }

        Collections.sort(arrHD, new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon a, HoaDon b){
                return (int)(b.loiNhuan() - a.loiNhuan());
            }
        });

        for(HoaDon x : arrHD){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
 */
