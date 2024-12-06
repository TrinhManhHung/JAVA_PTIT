//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;

class NhanVien{
    private String id, name;
    private long sal, day;
    //method
    public NhanVien(String id, String name, long sal, long day) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.day = day;
    }
    
    public String getMaPhongBan(){
        return this.id.substring(3);
    }
    public int getYears(){
        return Integer.parseInt(id.substring(1, 3));
    }
    public long getHeSoLuong(){
        if(this.id.charAt(0) == 'A'){
            if(getYears() >=1 && getYears() <=3) return 10;
            else if(getYears() >=4 && getYears() <=8) return 12;
            else if(getYears() >=9 && getYears() <=15) return 14;
            else if(getYears() >=16) return 20;
        }
        if(this.id.charAt(0) == 'B'){
            if(getYears() >=1 && getYears() <=3) return 10;
            else if(getYears() >=4 && getYears() <=8) return 11;
            else if(getYears() >=9 && getYears() <=15) return 13;
            else if(getYears() >=16) return 16;
        }
        if(this.id.charAt(0) == 'C'){
            if(getYears() >=1 && getYears() <=3) return 9;
            else if(getYears() >=4 && getYears() <=8) return 10;
            else if(getYears() >=9 && getYears() <=15) return 12;
            else if(getYears() >=16) return 14;
        }
        if(this.id.charAt(0) == 'D'){
            if(getYears() >=1 && getYears() <=3) return 8;
            else if(getYears() >=4 && getYears() <=8) return 9;
            else if(getYears() >=9 && getYears() <=15) return 11;
            else if(getYears() >=16) return 13;
        }
        return 0;
    }
    public long getLuongThang(){
        return this.sal * this.day * this.getHeSoLuong() * 1000;
    }
    public String toString(){
        return this.id + " " + this.name + " ";
    }
}
public class TN02012_TINH_LUONG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i =0; i <n; i++){
            String id = sc.next();
            String name = sc.nextLine().trim();
            map.put(id, name);
        }
        
        n = sc.nextInt();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            sc.nextLine();
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            arr.add(x);
        }
        
        for(NhanVien x : arr){
            System.out.print(x);
            System.out.println(map.get(x.getMaPhongBan()) + " " + x.getLuongThang());
        }
        sc.close();
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
*/